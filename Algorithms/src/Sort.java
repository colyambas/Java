public class Sort {
    public static  int[] bubbleSort(int[] arr) {
        int temp = 0;
        //int[] sortedArr = new int[arr.length];
        for (int i = arr.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
