import java.util.Scanner;

public class Main {
    public static void main( String args[] ){
        Scanner input = new Scanner(System.in);
        
        int contVogais = 0, contConso = 0, contEspacos = 0;
        
        String str = input.nextLine().toLowerCase(), vogais = "aeiou";
        
        for(int i = 0; i < str.length(); i++) {
            char letra = str.charAt(i);
            if(letra >= 'a' && letra <= 'z') {
                if(vogais.indexOf(letra) == -1) {
                    contConso++;
                } else {
                    contVogais++;
                }
            } else {
                contEspacos++;
            }
        }
        
        System.out.println("Quantidade vogais: " + contVogais);
        System.out.println("Quantidade Consoantes: " + contConso);
        System.out.println("Quantidade espaço em branco: " + contEspacos);
    }
}

