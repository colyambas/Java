public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jack", 120);
        Worker worker2 = new Worker("John", 150);
        Worker worker3 = new Worker("Sam", 100);
        Worker worker4 = new Worker("Goga", 100);
        Worker worker5 = new Worker("Max", 100);
        Worker worker6 = new Worker("Hope", 90);
        Worker worker7 = new Worker("Mike", 120);
        Worker worker8 = new Worker("Andy", 130);
        Worker worker9 = new Worker("George", 170);
        Worker worker10 = new Worker("Dave", 160);
        BaseManager manager1 = new BaseManager("Abish John", 200, 3);
        BaseManager manager2 = new BaseManager("Abish William", 200, 5);
        BaseManager manager3 = new BaseManager("Abish Bishop", 200, 2);
        Director director = new Director("Abish Abraham Esquire", 300, 13);

        Worker[] workersArr = {
                worker1, worker2, worker3, worker4, worker5, worker6, worker7, worker8, worker9, worker10
        };

        BaseManager[] managersArr = {
                manager1, manager2, manager3, director
        };

        WorkersUtils.getWorkerByName(workersArr, "Max");

        WorkersUtils.getNameContainsString(managersArr, "Bis");

        WorkersUtils.getSalaryBudget(workersArr);
        WorkersUtils.getSalaryBudget(managersArr);

        WorkersUtils.getMinSalary(workersArr);
        WorkersUtils.getMinSalary(managersArr);

        WorkersUtils.getMaxSalary(workersArr);
        WorkersUtils.getMaxSalary(managersArr);

        WorkersUtils.getMinNumberOfSubordinates(managersArr);
        WorkersUtils.getMaxNumberOfSubordinates(managersArr);

        WorkersUtils.getMinSalaryDifference(managersArr);
        WorkersUtils.getMaxSalaryDifference(managersArr);
    }
}
