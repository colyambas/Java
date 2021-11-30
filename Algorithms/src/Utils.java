import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class Utils {

    public static   int[] getIntArr(int count) {
        if (count > 0) {
            int[] arrInt = new int[count];
            for (int i = 0; i < count; i++) {
                arrInt[i] = new Random().nextInt() - 1_073_741_823;
                System.out.println(arrInt[i]);
            }
            return arrInt;
        } else {
            return new int[0];
        }
    }
}
