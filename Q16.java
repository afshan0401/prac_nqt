
import java.util.Arrays;

// for rat food how many houses required
public class Q16 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int r = sc.nextInt();
        // int unit = sc.nextInt();
        // sc.nextLine(); //newline cleanup

        // String line = sc.nextLine();
        // sc.close();
        // String[] parts = line.split(" ");
        // int[] arr = new int[parts.length];

        // for (int i = 0; i < parts.length; i++) {
        //     arr[i] = Integer.parseInt(parts[i]);
        // }
        
        int[] arr = {10,5,5};
        int unit = 5;
        int r = 3;

        System.out.println("r: " + r);
        System.out.println( "unit: "+unit);
        System.out.println("Array entered: " + Arrays.toString(arr));

        System.out.println(housesRequired(r, unit, arr));
    }

    public static int housesRequired(int r, int unit, int[] arr){
        if(arr == null) return -1;
        if(arr.length == 0) return 0;
        int food_required = r * unit;
        int food = 0;
        for(int i =0;i<arr.length;i++){
            food += arr[i];
            if(food>= food_required) return i+1;
        }
        return 0;
    }
}
