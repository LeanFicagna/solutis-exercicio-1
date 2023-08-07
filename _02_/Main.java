import java.util.Scanner;

public class Main {
    public static void main( String args[] ){
        Scanner input = new Scanner(System.in);
        int a, b, maior;
        
        a = input.nextInt();
        b = input.nextInt();
        
        maior = a >= b? a: b;
        System.out.println(maior);
    }
}
