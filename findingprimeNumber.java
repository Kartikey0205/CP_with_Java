import java.util.*;

public class findingprimeNumber {

    public static boolean findPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        boolean result = findPrimeNumber(num);
        if (result == false) {
            System.out.println("Not a PRIME NUMBER");
        } else {

            System.out.println(" PRIME NUMBER");
        }
    }

}
