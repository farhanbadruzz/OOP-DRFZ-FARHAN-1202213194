import java.util.ArrayList;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
            
        }
        // TODO Create Menu
        void menu(){
            String name;
            String category;
            int price;

            public void setName(String name){
                this.name = name;
            }

            Scanner scan = new Scanner(System.in);

            System.out.print("Nama item: ");
            scan. nextLine();
            

            
        }
        // TODO Insert Menu to Database


        // TODO Display Main Menu

        // TODO Create User


        // Display Menu
        System.out.println("Selamat Datang di restorran EAD");
        System.out.println("Silahkan Register terlebih dahulu");
        System.out.println("=================================");
        System.out.println("Nama: " + nama_user);
        System.out.println("No. Handphone: "+ no_HP);
    }
}

/*
1. Terdapat beberapa class yaitu, Database, Menu, Server, User
2. Pada class Database terdapat method Insert Menu, Show Menu, dan Search Menu
3. Didalam class Menu memiliki attribute Name, Category, dan Price
4. Pada class Server(Main Class) terdapat pilihan Menu, Pilih Menu, dan Keluar. Silahkan
Anda inputkan jenis menu minimal 3 beserta harganya
5. Pada class User silahkan Anda inputkan Nama = “Nama Pendek_Kelas” dan No.
handphone = “NIM”. Contoh : Raina_SI4507, 1202200195
6. Class Database memiliki relasi dependency dengan class menu
Hint:
1.Pada Class Database buatlah atribut List untuk menampung menu yang ada dan jadikan sebagai
objek ArrayList
2.Gunakan Perulangan for loop untuk menampilkan isi dari list menu
3.Pada Search Menu Gunakan perulangan for loop dan buat conditional if untuk mencari apakah
menu yang dicari ada pada list menu
 */