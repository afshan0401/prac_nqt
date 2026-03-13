import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        int[] arr = {-3,-3,-2,-1,-1,0,0,0,1};
        System.out.println(countUniqueAndPlaceFirst(arr));
        System.out.println(Arrays.toString(arr));

    }

    public static int countUniqueAndPlaceFirst(int[] arr){
        if(arr.length == 0) return 0;
        if(arr.length == 1) return 1;
        int left = 0;
        
        for (int right = 1; right < arr.length; right++) {
            if(arr[left] != arr[right]){
                arr[left+1] = arr[right];
                left++;
            }
        }

        return left+1;
    }
}
