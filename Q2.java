public class Q2 {
    public static void main(String[] args) {
        long n = 5;
        System.out.println(naturalNSum(n));
        System.out.println(longMethodSum(n));
        System.out.println(factorialSum(n));
    }

    //CORRECT ONE FOR 0(1) or constant constraint
    public static long naturalNSum(long n){
        return (n*(n+1))/2;
    }
    public static long longMethodSum(long n){
        int sum = 0;
        while(n>0){
            sum += n;
            n--;
        }
        return sum;
    }

    public static long factorialSum(long n){
        if(n==1) return 1;

        return (long)n + factorialSum(n-1);
    }
}
