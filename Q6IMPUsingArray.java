import java.util.*;

public class Q6IMPUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] students = new String[n][2];
        sc.close();
        for (int i = 0; i < n; i++) {
            students[i][0] = sc.next();
            students[i][1] = sc.next();
        }

        // a and b are rows already
        // a[0] name a[1] marks
        Arrays.sort(students, (a,b) -> {
            int m1 = Integer.parseInt(a[1]);
            int m2 = Integer.parseInt(b[1]);
            if(m1!=m2){
                return m2-m1;
            }else{
                return a[0].compareTo(b[0]);
            }
        });

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i][0] + " " + students[i][1]);
        }
    }
}
