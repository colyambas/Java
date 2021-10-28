public class Director extends Manager{
    Manager manager;

/*
    Director(String name, int baseSalary, int numberOfSubordinates) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.numberOfSubordinates = numberOfSubordinates;
    }
    */


    Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }


    Director(Manager manager) {
        super(manager.getName(), manager.getBaseSalary(), manager.numberOfSubordinates);
   //     this.name = manager.name;
   //     this.baseSalary = manager.baseSalary;
    //    this.numberOfSubordinates = manager.numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if (this.numberOfSubordinates > 0) {
            return this.getBaseSalary() + this.getBaseSalary() * ((this.numberOfSubordinates / 100.0) * 9);
        } else {
            return super.getBaseSalary();
        }
    }
}
