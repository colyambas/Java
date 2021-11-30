//import org.apache.commons.lang3.RandomUtils;

public class Main {

    public static void main(String[] args) {

        int[] arr = Utils.getIntArr(100);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Before = %d", arr[i]);
        }

        int[] arr1 = Sort.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("After = %d", arr[i]);
        }
    }
}
