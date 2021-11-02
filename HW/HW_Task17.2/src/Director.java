public final class Director extends BaseManager implements IManager{
    BaseManager manager;

    private static final double SALARY_COEF = 0.09;

    public Director(String name, double baseSalary, int numberOfSubordinates, BaseManager manager) {
        super(name, baseSalary, numberOfSubordinates);
        this.manager = manager;
    }

    Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }




    @Override
    public double getSalary() {
        if (this.numberOfSubordinates > 0) {
            return this.getBaseSalary() + this.getBaseSalary() * this.numberOfSubordinates * SALARY_COEF;
        } else {
            return super.getBaseSalary();
        }
    }
}
