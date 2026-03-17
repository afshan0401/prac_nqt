
import java.util.Arrays;

//extra numeric clusters and sum them
public class SQ5 {
    public static void main(String[] args) {
        String s = "1abc24a2afdx10a";

        // String cleaned = s.replaceAll("[^0-9]"," ");
        // System.out.println(cleaned);
        // String[] arr = cleaned.split("\\s+");
        //OR directly


        String[] arr = s.split("[^0-9]+");

        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for(String str : arr){
            if(str.length()==0) continue;
            // if(!str.isEmpty()){

            //     sum += Integer.parseInt(str);
            // }
                sum += Integer.parseInt(str);
        }
        System.out.println(sum);
        
    }
}
