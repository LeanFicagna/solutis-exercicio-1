import java.util.Scanner;

public class Main {
    public static void main( String args[] ){
        Scanner input = new Scanner(System.in);
        
        String[] semana = { "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado", "domingo" };
        
        int dia = input.nextInt() - 1;
        
        if(dia <= 7 && dia >= 1)
            System.out.println(semana[dia]);
        else
            System.out.println("Número não correspodente a nenhum dia da semana");
        
    }
}

