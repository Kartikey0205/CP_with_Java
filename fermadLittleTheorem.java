
/*
Fermad Litle's Theorem

choose
    a < number , a !=0 , a!= 1;
    then,

        -----------------------------------------
        |                                       |
        |    a^(number - 1) mod number = 1      |
        |                                       |
        -----------------------------------------

        then number is a prime number

But in some cases like when number = 511 for specific value of a = 123 it gives false positive menas it is  not a prime number but it still saying that it is a prime number , So solve this problem we are supposed to generate random value of a so that for many cases it repeat itself 




GENERATING RANDOM NUMBER 
Math.random()   ------> its value ranges from 0 to 1 

Math.random() * (Number - 3) ----> it become 0 if number is 3 so we want our a to greater than 0 and 1 also so 


a = Math.random()*(Number - 3) + 2     -----> minimum value of a is equals to 2
*/

import java.util.Scanner;
import java.math.*;

public class fermadLittleTheorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        System.out.println("Enter the number of steps you want to check your result ");
        int steps = sc.nextInt();
        int result = isPrimeVia_Fermad_Little_Theorem(number, steps);
        if (result == 0) {
            System.out.println("Not a Prime Number");
        } else {
            System.out.println("Prime Number");

        }
    }

    static int isPrimeVia_Fermad_Little_Theorem(int num, int steps) {
        int a = generateRandomNumber(num);
        while (steps > 0) {
            if ((Math.pow(a, (num - 1)) % num) == 1) {
                steps--;
                return 1;
            } else {
                steps--;
                return 0;
            }
        }
        return -1;
    }

    static int generateRandomNumber(int num) {
        int a;
        a = (int) Math.random() * (num - 3) + 2;
        return a;
    }
}
