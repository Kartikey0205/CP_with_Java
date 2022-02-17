import java.util.Scanner;

/*
        ax + by = c 
        Check whether any solution exits or not for any of x and y 

        --> If GCD of a and b akso divides the c also then there will be a solution

*/

public class linearEquation {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter value of c ");
        int c = sc.nextInt();

        System.out.println("Now equation will be " + a + "x " + "+ " + b + "y" + " = " + c);
        // Now we have to find whether solution exits or not

        int value_GCD = gcd(a, b);
        if (c % value_GCD == 0) {
            System.out.println("There exits a solution ");
        } else {
            System.out.println("Not exits a solution");
        }

    }
}
