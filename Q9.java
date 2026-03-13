public class Q9 {
    public static void main(String[] args) {

        int[] arr = { 0, 1, 2, 4, 5 };
        int n = arr.length;
        System.out.println(missingNumber(arr, n));

        int[] arr1 = { 8, 6, 4, 2, 3, 5, 7, 0, 1 };
        int n1 = arr1.length;
        System.out.println(missingNumber(arr1, n1));

    }

    public static int missingNumber(int[] arr, int n) {
        int sum = (n * (n + 1)) / 2;
        for (int num : arr) {
            sum -= num;
        }
        return sum;
    }
}
