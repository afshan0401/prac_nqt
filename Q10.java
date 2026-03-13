import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,0,4 };
        zerosToEnd(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void zerosToEnd(int[] arr) {
        int left = 0;

        for (int right = 1; right < arr.length; right++) {
            if (arr[right] != 0 && arr[left] == 0) {
                arr[left] = arr[right];
                arr[right] = 0;
                left++;
            } else if (arr[left] != 0) {
                left++;
            }
        }
    }
    public static void zerosToEndBetter(int[] arr) {
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            } 
        }
    }
}
