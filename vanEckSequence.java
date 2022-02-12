import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//  VanEck Sequence --> 0, 0 , 1 , 0 , 2 , 0 , 2 , 2 , 1, 6 , 0 , 5 ..... 

public class vanEckSequence {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much number you want to print");
        number = sc.nextInt();
        int i = 0;
        int vanAckNumber = 0;
        int currentIndex = 0;
        List<Integer> l1 = new ArrayList<>();
        while (i != number) {
            int distance;
            // value alraedy h
            if (l1.lastIndexOf(vanAckNumber) != -1) {
                distance = currentIndex - l1.lastIndexOf(vanAckNumber);
            } else { // value nhi h already
                distance = 0;
            }
            currentIndex++;
            i++;
            l1.add(vanAckNumber);
            System.out.println(l1 + " ");
            vanAckNumber = distance;

        }

    }
}
