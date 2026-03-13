public class Q23 {
    public static void main(String[] args) {
        int n =5;
        int[] days = {3,8,6,10,4};
        int k = 5;

        int fine = 0;
        for(int day: days){
            if(day>k){
                fine += day-k;
            }
        }

        System.out.println("Fine: Rs."+ fine);
    }
}
