package MODUL1;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database database = new Database()

        // TODO Create Menu
        Menu menu1 = new Menu();
        menu1.setName("Bakso");
        menu1.setCategory("Makanan");
        menu1.setPrice(10000);

        Menu menu2 = new Menu();
        menu2.setName("Es Teh");
        menu2.setCategory("Minuman");
        menu2.setPrice(5000);

        Menu menu3 = new Menu();
        menu3.setName("Brownies");
        menu3.setCategory("Dessert");
        menu3.setPrice(15000);

        // TODO Insert Menu to Database
        database.insertMenu(menu1);
        database.insertMenu(menu2);
        database.insertMenu(menu3);

        // TODO Display Main Menu
        Scanner scan = new Scanner(System.in);
        System.out.println("Selamat Datang di Restoran EAD\nSilahkan Register Terlebih Dahulu");
        System.out.println("==================");
        System.out.print("Nama:\t");
        String name = scan.nextLine();
        System.out.print("No. Handphone:\t");
        int noHP = scan.nextInt();

        // TODO Create User
        User user = new User();
        user.setName(name);
        user.setNoHP(noHP);

        // Display Menu
        while (true) {
            System.out.println("==================");
            System.out.println("1. Menu");
            System.out.println("2. Pilih Menu");
            System.out.println("3. Keluar");
            System.out.println("==================");
            System.out.println("Pilih Menu:\t");
            int menu = scan.nextInt();
            
            if (menu==1) {
                database.showMenu();
            } else if (menu==2) {
                System.out.print("Masukkan Nama Menu: ");
                String keyword = scan.nextLine();
                database.searchMenu();
            } else if (menu==3) {
                System.out.println("Terima Kasih");
                break;
            }
        }
