
import java.util.Scanner;

public class GoodNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases>0){
            int n = sc.nextInt();
            System.out.println(checkGoodNumber(n));
            testCases--;
        }
        sc.close();



    }

    public static String checkGoodNumber(int n){
        int sum = 0;
        int temp = Math.abs(n);
        while(temp>0){
            
            sum +=temp%10;
            temp/=10;
        }
        if (sum==0) return "Bad Number";
        return (n%sum==0?"Good Number": "Not Good Number");

    }
}
