public class Main {
    public static void main( String args[] ){
        for(int i = 3; i <= 100; i+=3){
            int a = i/2;
            double b = i/2;
            System.out.println("(int) " + i + "/2: " + a +
                                    "\t\t(double) " + i + "/2: " + b);
        }
    }
}
