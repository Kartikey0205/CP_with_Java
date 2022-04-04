public class mulArr {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 4, 5 };
        int newArr[] = new int[5];
        int mult = 1;
        for (int i = 0; i < 5; i++) {
            mult = mult * arr[i];
        }
        for (int i = 0; i < 5; i++) {
            newArr[i] = mult / arr[i];
        }

        System.out.println("Arr is");
        for (int i = 0; i < 5; i++) {
            System.out.println(newArr[i] + " ");
        }
    }
}
