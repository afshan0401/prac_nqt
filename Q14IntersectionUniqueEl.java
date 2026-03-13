
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q14IntersectionUniqueEl {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {3,4,5,6,7};
        int res[] = returnCommonInBoth(a, b);
        System.out.println(Arrays.toString(res));
        System.out.println(countCommonInBoth(a, b));



    }

    public static int countCommonInBoth(int[] a, int[] b){
        int count = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int numA: a){
            hs.add(numA);
        }
        for(int num: b){
            if(hs.contains(num)){
                count++;
                hs.remove(num); // to prevent duplicate counting
            }
        }
        return count;
    }

    public static int[] returnCommonInBoth(int[] a, int[] b){
        ArrayList<Integer> result = new ArrayList<>();

        HashSet<Integer> hs = new HashSet<>();
        for(int numA: a){
            hs.add(numA);
        }
        for(int num: b){
            if(hs.contains(num)){
                result.add(num);
                hs.remove(num); // to prevent duplicate counting
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = result.get(i);
        }
        return  res;
    }
}
