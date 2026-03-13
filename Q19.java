// frequency element create at i of i+1

public class Q19 {
    public static void main(String[] args) {
        int[] arr = {2,3,2,3,5};
        int n = 5;
        int p = 5;
        frequency(arr, n, p);
        for (int i = 0; i < arr.length; i++) {
            if(i>0) System.out.print(" ");
            System.out.print(arr[i]);
        }
    }

    public static void frequency(int[] arr, int n, int p){
        int[] freqarr = new int[n];

        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]>=1 && arr[i] <= n){
        //         freqarr[arr[i]-1]++;
        //     }
        // }
        for(int num: arr){
            if(num>=1 && num<= n){
                freqarr[num-1]++;
            }
        }
        for (int i = 0; i < freqarr.length; i++) {
            arr[i] = freqarr[i];
        }
    }
}
