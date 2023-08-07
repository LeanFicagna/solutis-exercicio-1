import java.util.Scanner;

public class Main {
    public static void main( String args[] ){
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble(), pi = 3.14159265359;
        double A = Math.ceil(r * r * pi);
        
        System.out.println("Raio: " + r + " Área: " + A);
    }
}
