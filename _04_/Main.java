import java.util.Scanner;

public class Main {
    public static void main( String args[] ){
        Scanner input = new Scanner(System.in);
        
        double distanciaMilhas = input.nextInt();
        double distanciaKm = distanciaMilhas * 1.609;
        
        System.out.println(distanciaKm + " km");
    }
}
