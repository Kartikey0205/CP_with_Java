
import java.util.Scanner;

public class quickSort {
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = getPivotIndex(arr, low, high);
            swap(arr, low, pivotIndex - 1);
            swap(arr, pivotIndex + 1, high);
        }

    }

    private static int getPivotIndex(int[] arr, int low, int high) {
        int pivot = arr[high];
        int pivotIndex = low;

        for (int i = low; i <= high - 1; i++) {
            if (arr[i] <= pivot) {
                // swap value at index i with pivotIndex
                int temp = arr[i];
                arr[i] = arr[pivotIndex];
                arr[pivotIndex] = temp;

                // increment pivotIndex
                pivotIndex++;
            }
        }

        // swap pivotIndex with high
        int temp = arr[high];
        arr[high] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        return pivotIndex;
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.err.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, arr.length - 1);
        System.out.println("The sorted array in ascending order is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}