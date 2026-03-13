
import java.util.Arrays;

public class Q22 {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {7,3,2,4,9,12,56};
        int m = 3;

        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n-m; i++) {
            int diff = arr[i+m-1] - arr[i];
            min = Math.min(min, diff);
        }
        System.out.println(min);

    }
}
