public class Q7 {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 1, 2, 3, 4 };
        System.out.println("Valid: " + validOrnot(arr));

    }

    public static boolean validOrnot(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                count++;
            if (count > 1)
                return false;
        }

        if (arr[n - 1] > arr[0]) {
            count++;
            if (count > 1)
                return false;
        }

        return true;
    }
}