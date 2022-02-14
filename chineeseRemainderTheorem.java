// Chineese Remainder Theorem

import java.util.Scanner;

public class chineeseRemainderTheorem {

    public static boolean isNumberFound = false;

    public static int count = 0;
    public static int number = 0;

    public static int crt(int div1[], int rem1[]) {
        while (!isNumberFound) {
            for (int i = 0; i < div1.length; i++) {
                if (number % div1[i] != rem1[i]) {
                    isNumberFound = false;
                    number++;
                    count++;
                    if (count > 500) {
                        System.out.println("No number found upto 500  so it will keep on running hence Exiting here");
                        System.exit(0);
                    }
                    break;
                } else {
                    isNumberFound = true;
                }

            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of arrays (Both array will be of same  size)");
        size = sc.nextInt();
        int div1[] = new int[size];
        System.out.println("Enter the values of divisor array");
        for (int i = 0; i < div1.length; i++) {
            div1[i] = sc.nextInt();
        }
        int rem1[] = new int[size];
        System.out.println("Enter the values of Remainder array");
        for (int i = 0; i < rem1.length; i++) {
            rem1[i] = sc.nextInt();
        }

        int result = crt(div1, rem1);
        System.out.println("Number is " + result);

    }
}
