import java.util.Scanner;

public class Main {
    public static void main( String args[] ){
        int prodInt = 1;
        float prodFloat = 1;
        
        for(int i = 15; i <= 30; i+=2) {
            prodInt *= i;
            prodFloat *= i;
        }
        
        System.out.println("(int): " + prodInt);
        System.out.println("(float): " + prodFloat);
    }
}
