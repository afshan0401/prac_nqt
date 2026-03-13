public class Q17 {
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,9};
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int n : arr){
            if(n>max) max = n;
            if(n<min) min = n;
        }

        System.out.println("Min: "+ min);
        System.out.println("Max: "+ max);
    }

}
