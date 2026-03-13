import java.util.Arrays;

public class Q15 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,4};
        int k = 3;
        System.out.println(maxFrequency(arr, k));

    }

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        long sum = 0;
        int maxFreq = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while ((long) nums[right] * (right - left + 1) - sum > k) {
                sum -= nums[left];
                left++;
            }
            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
    }
}
