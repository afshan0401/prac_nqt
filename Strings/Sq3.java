//reverse String word by word without exra Array or split use

public class Sq3 {
    public static void main(String[] args) {
        String str = "My name is Afshan";

        char[] arr = str.toCharArray();
        //reverse whole array
        reverse(arr, 0, arr.length-1);

        //reverse from 1st word to 2nd last word using ' ' as end mark and start as start of a word index
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            if(arr[end] == ' '){
                reverse(arr, start, end-1);
                start = end + 1;
            }
        }

        //last word reverse
        reverse(arr, start, arr.length-1);

        System.out.println(new String(arr));
    }

    //helper fn to reverse arr in space
    public static void reverse(char[] arr,int left,int right){

        while(left<right){
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}
