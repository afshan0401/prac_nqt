public class Q26 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int n = arr.length;

        System.out.println(onlyOneOccurence(arr, n));
    }

    public static int onlyOneOccurence(int[] arr, int n){
        int xor = 0;
        for(int num: arr){
            xor ^= num;
        }
        return xor;
    }
}
