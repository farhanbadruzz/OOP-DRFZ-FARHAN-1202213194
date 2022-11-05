import java.util.Scanner;
public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    public void user(){
        String nama_user;
        int no_HP;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("User: ");
            scan.nextLine();

            System.out.print("No. Handphone: ");
            scan.nextInt();
        }
        
    }
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void Registeruser(){
        System.out.println("Register Success");
        System.out.println("Name: " + nama_user);
        System.out.println("No. Handphone: " + no_HP);
    }
}
