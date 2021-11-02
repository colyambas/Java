/*
* Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
* Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования
* (объекты класса Month).
*
* Необходимо реализовать задание из Tasks#15, но класс Month заменить на интерфейс IMonth,
* а его реализацию сделать приватным классом MonthImpl.
*
* */
public class MonthHelper {
    public interface IMonth {
        String getName();
        int getDays();
        int getWorkDays();
        //public static String monthName;
    }

    private static class MonthImpl implements IMonth {
        private String name;
        private int days;
        private int workDays;

        public MonthImpl(String name, int days, int workDays) {
            this.name = name;
            this.days = days;
            this.workDays = workDays;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getDays() {
            return days;
        }

        @Override
        public int getWorkDays() {
            return workDays;
        }
    }

    public static final IMonth[] MONTHS = {
            new MonthImpl("Jan", 31, 21),
            new MonthImpl("Feb", 28,20)
    };
}

