import java.util.Arrays;

public class DutchFlagAlgo {
    public static void main(String[] args) {
        int[] arr = {1,2,0,1,1,2,0,0,2,0,1,0};
        dutchNationalFlag(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void dutchNationalFlag(int[] arr){
        int low = 0;
        int mid = 0; //being examind pos
        int high = arr.length-1;

        while(mid<=high) //Because everything between mid and high is not yet processed.
        {
            if(arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
                //no mid++ coz element swapped from high can be 0 1 or 2/
                //must check again
            }else{
                mid++;
            }
        }
    }
}
