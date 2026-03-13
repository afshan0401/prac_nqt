public class Q21 {
    public static void main(String[] args) {
        String s = "daaddaababbabbbadd";
        int count = 0;
        
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                if(count==2){
                    System.out.println("Spam");
                    return;
                }
            }
            else{
                count=0;
            }
        }
        System.out.println("Not spam");
        
    }

}
