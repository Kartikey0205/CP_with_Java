import java.util.Scanner;

public class fibonacci {

    public static int fibo(int num) {
        if (num == 0 || num == 1) {
            return num;
        } else if (num < 0) {
            return -1;
        } else {
            return (fibo(num - 1) + fibo(num - 2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count, i = 0;
        System.out.println("Enter a positive number");
        count = sc.nextInt();
        while (i < count) {
            System.out.println(fibo(i));
            i++;
        }
    }
}
