import java.util.Scanner;

public class stairCase_BruteMethod {

    public static int countSteps(int n) {
        if (n == 0 || n == 1) {
            return 1;

        }
        int steps = 0;
        steps = countSteps(n - 1) + countSteps(n - 2);
        return steps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of stairs : ");
        int n = sc.nextInt();
        System.out.println("Total number of steps for going up via brute method is : " + countSteps(n));
    }
}
