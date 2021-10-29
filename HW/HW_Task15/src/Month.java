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

public class Month {
    private String monthName;
    private int numberOfDays;
    private int NumberOfJobdays;

    public Month(String monthName, int numberOfDays, int NumberOfJobdays) {
        this.monthName = monthName;
        this.numberOfDays = numberOfDays;
        this.NumberOfJobdays = NumberOfJobdays;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getNumberOfJobdays() {
        return NumberOfJobdays;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setNumberOfJobdays(int numberOfJobdays) {
        NumberOfJobdays = numberOfJobdays;
    }
}
