import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        long[] arr = { 3, 2, 1, 56, 10000, 167 };
        long[] result = minMax(arr);
        System.out.println(Arrays.toString(result));

    }

    public static long[] minMax(long[] arr) {
        long min = arr[0];
        long max = arr[0];
        for (long n : arr) {
            if (n > max)
                max = n;
            if (n < min)
                min = n;
        }

        return new long[] { min, max };
    }

}
