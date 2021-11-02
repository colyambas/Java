public class LastName extends Employee {
    //implements ISalary{


    public LastName(String name, int age, char gender, int salaryPerDay, Employee employee) {
        super(name, age, gender, salaryPerDay);
        this.employee = employee;
    }

    Employee employee;
    //@Override
    int getSalary() {
        return employee.getSalaryPerDay();
    }

}
