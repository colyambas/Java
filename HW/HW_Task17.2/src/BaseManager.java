public class BaseManager extends Worker implements IManager{
    //Worker worker;
    int numberOfSubordinates;

    private static final double SALARY_COEF = 0.03;

    public BaseManager(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public void setBaseSalary(double baseSalary) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getBaseSalary() {
        return this.baseSalary;
    }

    @Override
    public int getNumberOfSubordinates() {
        return this.numberOfSubordinates;
    }

    @Override
    public void setNumberOfSubordinates(int numberOfSubordinates) {

    }

    public double getSalary() {
        if (this.numberOfSubordinates > 0) {
            return this.getBaseSalary() + this.getBaseSalary() * this.numberOfSubordinates * SALARY_COEF;
        } else {
            return super.getBaseSalary();
        }
    }
}
