//3
public class SortExcept {
    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 21, 3, 41, 5 };
        int index = 0;
        System.out.println("Before sorting ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sortArray(arr);
        System.out.println("\nAfter sorting ");
        try {
            while (true) {
                System.out.print(arr[index] + " ");
                index++;
            }
        } catch (Exception e) {
            System.out.println("\nEnd of array has been reached");
        }
    }
}
