public class swapNumber {

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        System.out.println("a = " + a + " b = " + b);

        swap(a, b);

    }
}
