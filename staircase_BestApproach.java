
import java.util.Scanner;

public class staircase_BestApproach {
    public static long countSteps(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int arr[] = new int[2];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {

            int temp = arr[1];
            arr[1] = arr[0] + arr[1];
            arr[0] = temp;

        }
        return arr[1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of stairs : ");
        int n = sc.nextInt();
        long totalSteps = countSteps(n);
        System.out.println("Total number of steps for going up via litle much better method is : " + totalSteps);
    }
}
