/*

Задача №1

Необходимо реализовать задание из Tasks#15 со следующими условиями:
Класс Month сделать неизменяемым (immutable)
Статические поля с объектами месяцев должны быть финальными
Создать статические методы возвращающие кварталы (массивы по 3 месяца соответственно), полугодия и год.
Необходимо создать базовый абстрактный класс BaseEmployee как общего родителя
Классы Employee и Manager должны быть финальными

*/
public abstract class BaseEmployee {
    public abstract int getSalaryPerDay();

    public abstract int getSalary(Month[] monthsArr);
}
