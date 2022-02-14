// Eucledian Algorithm

import java.util.Scanner;

public class EuclideanAlgoGCD {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of first number ");
        int a = sc.nextInt();
        System.out.println("Enter the value of second number ");
        int b = sc.nextInt();

        int gcd = gcd(a, b);
        System.out.println("G C D of a = " + a + " & b = " + b + " is = " + gcd);
    }
}

// when for loop -> Complexity will be O(max(a,b))
// when division -> Complexity will be log(min(a,b))
