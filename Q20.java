
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        int min = 9;
        int max = 0;
        if (n == 0) {
            min = 0;
            max = 0;
        }

        while (n > 0) {
            int rem = n % 10;
            min = Math.min(min, rem);
            max = Math.max(max, rem);
            n /= 10;
        }
        System.out.println(min + " " + max);
    }
}
