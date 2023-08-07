import java.util.Scanner;

public class Main {
    public static void main( String args[] ){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().toLowerCase();
        
        if(isPalindrome(str))
            System.out.println("A palavra " + str + " é um palídromo");
        else
            System.out.println("A palavra " + str + " não é um palídromo");
    }
    
    public static boolean isPalindrome(String str) {
        return str.equals( stringReverse(str) );
    }
    
    public static String stringReverse(String s) {
        String sReverse = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            sReverse += s.charAt(i);
        }
        return sReverse;
    }
}
