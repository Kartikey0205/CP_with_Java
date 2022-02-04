import java.util.Scanner;

public class factorial {
    public static int fact(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * fact(number - 1);
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();

        System.out.println(fact(num));
    }
}
