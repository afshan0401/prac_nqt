import java.util.Arrays;

public class RotateArrayLeftright {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2;


        leftRotate(k, arr);
        rightRotate(k, arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void leftRotate(int k, int[] arr) {
        int n = arr.length;
        k = k % n;
        // if k is bigger reduce its size less than n, also to avoid multiple
        // unnecessary rotation.
        // example k = 8 % 7 = 1 rotation needed in place of 7

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + k) % n];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

    }

    private static void rightRotate(int k, int[] arr) {
        int n = arr.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
