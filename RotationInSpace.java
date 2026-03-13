import java.util.Arrays;

public class RotationInSpace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 3;
        // rotateRightWithTempArr(arr, k, n);
        // rotateRightInSpace(arr, k, n);
        rotateLeftInSpace(arr, k, n);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateRightInSpace(int[] arr, int k, int n){
        //reverse whole arr
        //reverse k
        //reverse n-k
        k = k % n;
        reverseHelper(arr, 0, n-1); //whole
        reverseHelper(arr, 0, k-1); //first k
        reverseHelper(arr, k, n-1); // last n-k
    }
    public static void rotateLeftInSpace(int[] arr, int k, int n){
        //reverse k
        //reverse n-k
        //reverse whole arr
        k = k % n;
        reverseHelper(arr, 0, k-1); //first k
        reverseHelper(arr, k, n-1); // last n-k
        reverseHelper(arr, 0, n-1); //whole
    }
    
    public static void reverseHelper(int[] arr, int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void rotateRightWithTempArr(int[] arr, int k, int n){
        k = k % n;
        int[] temp = new int[n];
    
        for (int i = 0; i < n; i++) {
            temp[(i+k)%n] = arr[i];
        }
    
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
