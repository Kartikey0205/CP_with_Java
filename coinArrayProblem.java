// Lets suppose user enter 553 ruppees so total minimum coin will be 57 = 10 * 55 + 2 * 1 + 1 * 1

/*
for loop - 
    if (number > a [i])
            count = count + number/ a[i]
            number = number % a[i]

    i++
*/

import java.util.Scanner;

public class coinArrayProblem {
    public static void main(String[] args) {
        int totalCoins = 0;
        int tensCoin = 0, twoCoin = 0, fiveCoin = 0, oneCoin = 0;
        int coinArr[] = { 10, 5, 2, 1 }; // coin curremcy of INDIA
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total money you want ");
        int total_Money = sc.nextInt();
        int amount = total_Money;
        for (int i = 0; i < coinArr.length; i++) {
            if (total_Money >= coinArr[i]) {
                totalCoins = totalCoins + (total_Money / coinArr[i]);
                // different coins calculation
                if (coinArr[i] == 10) {
                    tensCoin = (total_Money / coinArr[i]);
                } else if (coinArr[i] == 5) {
                    fiveCoin = (total_Money / coinArr[i]);
                } else if (coinArr[i] == 2) {
                    twoCoin = (total_Money / coinArr[i]);
                } else {
                    oneCoin = (total_Money / coinArr[i]);
                }
                int left_Money = (total_Money % coinArr[i]);

                total_Money = left_Money;
            }

        }
        System.out.println(" Total minimum number of coins required to complete the Rs." + amount + " =  "
                + totalCoins + " coins\n having \n " + tensCoin + " coins of 10 Rs \n " + fiveCoin
                + " coins of 5 Rs \n "
                + twoCoin + " coins of 2 Rs \n " + oneCoin + " coins of 1 Rs");
    }
}
