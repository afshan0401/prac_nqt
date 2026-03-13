public class Q3 {
    public static void main(String[] args) {
        String s = "1C0C1C1A0B1";
        System.out.println(command(s));

    }

    public static int command(String s) {
        if (s == null || s.equals("NULL")) {
            return -1;
        }

        char[] arr = s.toCharArray();
        int result = arr[0] - '0'; //convert to int
        for (int i = 2; i < arr.length; i += 2) {
            int next = arr[i] - '0';
            if (arr[i - 1] == 'A') {
                result = result & next;
            } else if (arr[i - 1] == 'B') {
                result = result | next;
            } else if (arr[i - 1] == 'C') {
                result = result ^ next;
            }
        }

        return result;
    }
}
