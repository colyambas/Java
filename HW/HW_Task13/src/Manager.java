/*

Задача №1

        Необходимо создать класс Employee со следующими методами:
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
public class Manager extends Worker{
    //Worker worker;
    Worker worker;
    public int numberOfSubordinates;

    Manager(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    Manager(Worker worker, int numberOfSubordinates) {
        super(worker.getName(), worker.getBaseSalary());
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

   // @Override
    public double getSalary() {
        if (this.numberOfSubordinates > 0) {
            return this.getBaseSalary() + this.getBaseSalary() * (3 * (this.numberOfSubordinates / 100.0));
        } else {
            return super.getBaseSalary();
        }
    }
}
