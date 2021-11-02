/*

Задача №1

        Необходимо создать класс IIEmployee со следующими методами:
        getBaseSalary - получить базовую ставку
        setBaseSalary
        getName - получить имя
        setName
        getSalary - получить зарплату


        Задача №2

        Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.

        Необходимо создать класс Manager в который нужно добавить следующие методы:
        getNumberOfSubordinates - получить количество подчиненных
        setNumberOfSubordinates

        в классе, метод getSalary будет возвращать значение по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3).
        Если количество подчиненных 0, то результат как у обычного рабочего.

        Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен возвращать
        результат по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0,
        то результат как у обычного рабочего.


        Задача №3

        Необходимо создать утилитарный класс со следующими методами:
        поиск сотрудника в массиве по его имени
        поиск сотрудника в массиве по вхождению указанной строки в его имени
        подсчет зарплатного бюджета для всех сотрудников в массиве
        поиск наименьшей зарплаты в массиве
        поиск наибольшей зарплаты в массиве
        поиск наименьшего количества подчиненных в массиве менеджеров
        поиск наибольшего количества подчиненных в массиве менеджеров
        поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
        поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
*/

public class Worker implements IEmployee{

    //IEmployee IEmployee;

    public String name;
    public double baseSalary;

    public Worker(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary() {
        return baseSalary;
    }

    @Override
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public  double getBaseSalary() {
        return getBaseSalary();
    }
}
