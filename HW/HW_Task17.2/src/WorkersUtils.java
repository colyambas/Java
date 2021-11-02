public class WorkersUtils {
    Worker[] workers;

    public static void getWorkerByName(Worker[] workers, String name) {
        int i = 0;
        if (workers == null || workers.length == 0) {
           System.out.println("0");
        } else {
            for (; i < workers.length; i++) {
                if (workers[i].getName().contains(name)) {
                    System.out.println(workers[i].getName() + " является " + (i + 1)  + " сотрудником");
                }
            }
        }
        /*
        if (i >= workers.length) {
            System.out.println("Такого сотрудника нет");
        }
*/
    }

    public static void getNameContainsString(Worker[] workers, String nameSubstring) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().contains(nameSubstring)) {
                System.out.println(workers[i].getName());
            }
        }
    }


    public static void getSalaryBudget(Worker[] workers) {
        double sum = 0;
        for (int i = 0; i < workers.length; i++) {
            sum += workers[i].getSalary();
        }
        System.out.println("Зарплата всех сотрудников = " + sum);
    }

    public static void getSalaryBudget(BaseManager[] managers) {
        double sum = 0.0;
        for (int i = 0; i < managers.length; i++) {
            sum += managers[i].getSalary();
        }
        System.out.println("Зарплата всех менеджеров = " + sum);
    }

    public static void getMinSalary(Worker[] workers) {
        double min = workers[0].getSalary();
        for (int i = 1; i < workers.length; i++) {
            if (min > workers[i].getSalary()) {
                min = workers[i].getSalary();
            }
        }
        System.out.println(min);
    }

    public static void getMaxSalary(Worker[] workers) {
        Worker worker = workers[0];

        for (int i = 1; i < workers.length; i++) {
            if (worker.getSalary() < workers[i].getSalary()) {
                worker = workers[i];
            }
        }
        System.out.println(worker.getName() + " salary: " + worker.getSalary());
    }

    public static void getMinNumberOfSubordinates(BaseManager[] managers) {
        int result = managers[0].numberOfSubordinates;
        for (int i = 1; i < managers.length; i++) {
            if (result > managers[i].numberOfSubordinates) {
                result = managers[i].numberOfSubordinates;
            }
        }
        System.out.println("Minimum value of subordinates = " + result);
    }

    public static void getMaxNumberOfSubordinates(BaseManager[] managers) {
        int result = managers[0].numberOfSubordinates;
        for (int i = 1; i < managers.length; i++) {
            if (result < managers[i].numberOfSubordinates) {
                result = managers[i].numberOfSubordinates;
            }
        }
        System.out.println("Maximum value of subordinates = " + result);
    }

    public static void getMinSalaryDifference(BaseManager[] managers) {
        BaseManager manager = managers[0];
        for (int i = 1; i < managers.length; i++) {
            if ((manager.getSalary() - manager.getBaseSalary()) > (managers[i].getSalary() - managers[i].getBaseSalary())) {
                manager = managers[i];
            }
        }
        System.out.println(manager.getName() + " Minimum value of salary difference = " +
                + (manager.getSalary() - manager.getBaseSalary()));
    }

    public static void getMaxSalaryDifference(BaseManager[] managers) {
        BaseManager manager = managers[0];
        for (int i = 1; i < managers.length; i++) {
            if ((manager.getSalary() - manager.getBaseSalary()) < (managers[i].getSalary() - managers[i].getBaseSalary())) {
                manager = managers[i];
            }
        }
        System.out.println(manager.getName() + " Maximum value of salary difference = " +
                + (manager.getSalary() - manager.getBaseSalary()));
    }
}
