//reverse String
import java.util.*;
public class SQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputs = sc.nextInt();
        sc.nextLine();
        String[] results = new String[inputs];
        for (int i = 0; i < inputs; i++) {
            String str = sc.nextLine();
            results[i] = new StringBuilder(str).reverse().toString();
        }

        for(String str: results){
            System.out.println(str);
        }

        
        

    }
}
