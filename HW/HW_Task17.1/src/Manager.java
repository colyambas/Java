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


Задача №1

Необходимо реализовать задание из Tasks#15 со следующими условиями:
Класс Month сделать неизменяемым (immutable)
Статические поля с объектами месяцев должны быть финальными
Создать статические методы возвращающие кварталы (массивы по 3 месяца соответственно), полугодия и год.
Необходимо создать базовый абстрактный класс BaseEmployee как общего родителя
Классы Employee и Manager должны быть финальными
*/

public final class Manager extends BaseEmployee{
    //Employee employee;
    private String name;
    private int age;
    private char gender;
    private int salaryPerDay;
    private int numberOfSubordinates;

    public Manager(String name, int age, char gender, int salaryPerDay, int numberOfSubordinates) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salaryPerDay = salaryPerDay;
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public  int getSalaryPerDay() {
        return salaryPerDay;
    };

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