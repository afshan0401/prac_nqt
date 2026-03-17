//reverse String word by word
public class SQ2 {
    public static void main(String[] args) {
        String str = "My name is Afshan";

        String[] strArr = str.split("\\s+");
        int left = 0;
        int right = strArr.length-1;
        while(left<right){
            String temp = strArr[left];
            strArr[left] = strArr[right];
            strArr[right] = temp;
            left++;
            right--;
        }

        System.out.println(String.join(" ", strArr));

        
    }
}
