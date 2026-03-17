//check symmetric with space ignored and case insensitive
public class Sq4 {
    public static void main(String[] args) {
        String s = "N2 i&nJA?a& jnI2n";
        
        String cleaned = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(cleaned).reverse();

        System.out.println(cleaned);
        System.out.println(sb);
        System.out.println(cleaned.equals(sb.toString()));
    }
}
