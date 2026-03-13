import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};

        List<Integer> guardian = new ArrayList<>(); 
        int max = arr[arr.length-1];
        guardian.add(max); 
        for (int i = arr.length-2; i >=0 ; i--) {
            if(arr[i] >= max){
                max = arr[i];
                guardian.add(arr[i]);
            }
        }
        Collections.reverse(guardian);
        System.out.println(guardian);
    }
}
