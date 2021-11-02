public class MonthUtils {
    Month month;
    public static final Month[] MONTHS = {
            new Month("January", 31, 21),
            new Month("February", 28, 21),
            new Month("March", 31, 21),
            new Month("April", 31, 22),
            new Month("May", 31, 19),
            new Month("June", 30, 20),
            new Month("July", 31, 23),
            new Month("August", 31, 22),
            new Month("September", 30, 22),
            new Month("October", 31, 22),
            new Month("November", 30, 22),
            new Month("December", 31, 21)
    };

    public static Month[] getQuarter(int numberOfQuarter) {
        Month[] quarter = {null, null, null};
        switch (numberOfQuarter) {
            case (1):
                Month[] quarter1 = {MonthUtils.MONTHS[0], MonthUtils.MONTHS[1], MonthUtils.MONTHS[2]};
                return quarter1;
                //quarter[0] = MONTHS[0];
                break;
            case (2):
                Month[] quarter2 = {MonthUtils.MONTHS[3], MonthUtils.MONTHS[4], MonthUtils.MONTHS[5]};
                return quarter2;
                break;
            case (3):
                Month[] quarter3 = {MonthUtils.MONTHS[6], MonthUtils.MONTHS[7], MonthUtils.MONTHS[8]};
                return quarter3;
            break;
            case (4):
                Month[] quarter4 = {MonthUtils.MONTHS[9], MonthUtils.MONTHS[10], MonthUtils.MONTHS[11]};
                return quarter4;
            break;
            default:
                return null;
                break;
        }
    }

    public static Month[] getHalfYear(int numberOfHalfYear) {

        //Month[] halfYear = {null, null, null, null, null, null};

        if (numberOfHalfYear == 1) {
            Month[] halfYear = {MonthUtils.MONTHS[0], MonthUtils.MONTHS[1], MonthUtils.MONTHS[2],
                    MonthUtils.MONTHS[3], MonthUtils.MONTHS[4], MonthUtils.MONTHS[5]};
            //return firstHalfYear;
        }
        if (numberOfHalfYear == 2)  {
                Month[] secondHalfYear = {MonthUtils.MONTHS[0], MonthUtils.MONTHS[1], MonthUtils.MONTHS[2],
                        MonthUtils.MONTHS[3], MonthUtils.MONTHS[4], MonthUtils.MONTHS[5]};
                return secondHalfYear;
            }

        return halfYear;
    }
}
