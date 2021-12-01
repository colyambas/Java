import java.lang.reflect.Array;
import java.util.ArrayList;

public class Search {
    public static int binarySearch(int[] arr, int searchElem) {
        int numberOfElement = 0;
        if (arr.length > 1) {
            //new ArrayList<Integer>()
            int med = arr.length / 2;
            //int count = arr.length;
            for (int count = arr.length; count > 0; ) {
                count /= 2;
                if (arr[med] > searchElem) {
                    med = med - med / 2;
                } else {
                    if (arr[med] < searchElem) {
                        med = med + (arr.length - med) / 2;
                    } else {
                        numberOfElement = med;
                    }
                }
            }
        }
        return numberOfElement;
    }
}
