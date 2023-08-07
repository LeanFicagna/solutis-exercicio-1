import java.util.Scanner;

public class Main {
    public static void main( String args[] ){
        Scanner input = new Scanner(System.in);
        
        String str1 = input.nextLine(), str2 = input.nextLine();
        
        System.out.println(str1.compareTo(str2) <= 0? str1 + "\n" + str2: str2 + "\n" + str1);
        System.out.print("Palavra com mais caracteres: ");
        System.out.print(str1.length() > str2.length()? str1: 
                                                    str1.length() == str2.length()? "quantidades iguais": str2);
    }
}
