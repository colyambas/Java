/*

Задача №1

Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней. Создать класс MonthUtils,
который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).


Задача №2

Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день. Все поля сделать приватными и для каждого
поля добавить методы set и get. Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату
за те месяцы которые были переданы в качестве аргумента.


Задача №3

Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных. Все поля сделать
приватными и для каждого поля добавить методы set и get. Класс должен иметь метод - getSalary(Month[] monthArray),
метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
*/

public class Manager extends Employee{
    //Employee employee;
    private int numberOfSubordinates;

    public Manager(String name, int age, char gender, int salaryPerDay, int numberOfSubordinates) {
        super(name, age, gender, salaryPerDay);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    @Override
    public int getSalary(Month[] monthsArr) {
        int resultForMonth = 0;
        int result = 0;
        for (int i = 0; i < monthsArr.length; i++) {
            resultForMonth = monthsArr[i].getNumberOfJobdays() * this.getSalaryPerDay();
            result += resultForMonth + resultForMonth * 0.01 * this.getNumberOfSubordinates();
        }
        return result;
    }
}
