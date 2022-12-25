import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Restaurant machine = new Restaurant();
        int customerID, orderQty;
        try {
            System.out.println("Enter Customer ID: "); customerID = scan.nextInt();

            System.out.println("Enter how many food to make: "); orderQty = scan.nextInt();

            Thread thread1 = new Thread(machine);
            Waiters waiters = new Waiters(orderQty, customerID);
            Thread thread2 = new Thread(waiters);

            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();

        } catch (Exception e) {
            System.out.println("Error!!\nInput must be Integer");
        }
        scan.close();

    }

}
