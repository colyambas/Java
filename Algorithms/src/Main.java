//import org.apache.commons.lang3.RandomUtils;

public class Main {

    public static void main(String[] args) {

        int[] arrSortable = {-10, -7, -5, -5, -2, -1, 0, 0, 0, 1, 1, 3, 4, 5, 6, 7, 8, 8, 9, 10};
        int[] arr = Utils.getIntArr(10);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Before = %d\n", arr[i]);
        }

        int[] arr1 = Sort.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("After = %d\n", arr[i]);
        }

        System.out.println(arrSortable.length);
        //System.out.println(Search.binarySearch(arrSortable, -1));
        //System.out.println(Search.binarySearch(arrSortable, 1));
        //System.out.println(Search.binarySearch(arrSortable, 7));
        System.out.println(Search.binarySearch(arrSortable, -7));
        System.out.println(Search.binarySearch(arrSortable, -5));
    }
}
