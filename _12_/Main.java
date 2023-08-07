import java.util.Scanner;

public class Main {
    public static void main( String args[] ){
        Scanner input = new Scanner(System.in);
        
        int kmDirigidosTotal = 0, combustivelLitroTotal = 0;
        float consumoGeral;
        
        boolean bContinue = true;
        while(bContinue) {
            System.out.println("Quantos km dirigidos?");
            int kmDirigidos = input.nextInt(); 
            
            System.out.println("Quantos litros consumidos?");
            int combutivelConsumido = input.nextInt();
            
            float kmLitros = (float)kmDirigidos/combutivelConsumido;
            System.out.println("Consumo de: " + kmLitros + " km/l");
            System.out.println("");
            
            System.out.println("Quer sair do programa? (digite 0 para sair)");
            System.out.println("");
            if(
                input.nextInt() == 0
                )
                bContinue = false;
            
            kmDirigidosTotal += kmDirigidos;
            combustivelLitroTotal += combutivelConsumido;
        }
        
        consumoGeral = (float)kmDirigidosTotal/combustivelLitroTotal;
        
        System.out.println("km total dirigidos: " + kmDirigidosTotal + " km");
        System.out.println("Gastos em litros total: " + combustivelLitroTotal + " l");
        System.out.println("Consumo geral: " + consumoGeral + " km/l");
    }
}
