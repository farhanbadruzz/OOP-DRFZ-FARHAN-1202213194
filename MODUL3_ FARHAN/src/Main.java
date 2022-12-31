import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // System.out.println("Hello, World!");
        Calculation calc = new Calculation();
        Thread t1 = new Thread(calc);
        Scanner Scanner = new Scanner(System.in);
        boolean repeat = false;
        
        do{
            System.out.println("=== menu program ===\n 1. Square\n 2. Circle\n 3.Trapezoid");
            System.out.println("Select Menu: ");
            int operation = Scanner.nextInt();
            try{
                switch(operation){
                    case 1:
                        System.out.println("Lenght: ");
                        calc.side = Scanner.nextDouble();
                        calc.setSquare();
                        t1.start();
                        t1.join();
                        System.out.println("The calc result: " + calc.getSquare());
                        break;
                        System.out.println("");
                    case 2:
                        System.out.println("Radius: ");
                        calc.side = Scanner.nextDouble();
                        calc.setCircle();
                        t1.start();
                        t1.join();
                        System.out.println("The calc result: " + calc.getCircle());
                        break;
                        System.out.println("");     
                    case 3:
                        System.out.println("Side upper: ");
                        Double a = Scanner.nextDouble();
                        System.out.println("Side base: ");
                        Double b = Scanner.nextDouble();
                        System.out.println("Side height: ");
                        Double c = Scanner.nextDouble();                        
                        calc.side = Scanner.nextDouble();
                        calc.setTrapezoid(a,b,c);
                        t1.start();
                        t1.join();
                        System.out.println("The calc result: " + calc.getTrapezoid());
                        break;
                        System.out.println("");                                                             
                }
            }catch (InputMismatchException e){


            }
        }while(repeat);
        Scanner.close();
    }
}