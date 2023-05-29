package sort;


public class HeapSort {

    public static void heapSort(int[] array) {
        heapSort(array, array.length);
    }

    private static int heapSort(int[] array, int numbers) {
        if (numbers > 1) {
            int n = numbers / 2 - 1;
            for (int i = n; i > -1; i--) {
                int largest = i;
                int first = largest * 2 + 1;
                int second = largest * 2 + 2;
                if (first < numbers - 1 && array[first] > array[largest]) {
                    largest = first;
                }
                if (second < numbers - 1 && array[second] > array[largest]) {
                    largest = second;
                }
                if (i != largest) {
                    array[i] += array[largest];
                    array[largest] = array[i] - array[largest];
                    array[i] -= array[largest];
                }
            }
            numbers--;
            array[0] += array[numbers];
            array[numbers] = array[0] - array[numbers];
            array[0] -= array[numbers];

            return heapSort(array, numbers);
        }
        return 1;
    }
}
