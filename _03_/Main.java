import java.util.Scanner;

public class Main {
    public static void main( String args[] ){
        Scanner input = new Scanner(System.in);
        
        int number;
        number = input.nextInt();
        
        for(int i = 1; i < number; i++) {
            if(isPrime(i))
                System.out.println(i);
        }
    }
    
    public static boolean isPrime(int number) {
        for(int i = 2; i < number; i++) {
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
