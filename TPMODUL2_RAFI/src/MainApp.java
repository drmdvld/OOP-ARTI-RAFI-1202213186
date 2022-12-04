public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat("WD My Passport", 32, 3.2f);
        Handphone hp = new Handphone(false, "Toshiba", 8, 2.2f);
        Laptop laptop = new Laptop("Seagate", 16, 3.2f, false);

        perangkat.informasi();

        System.out.println();

        hp.informasi();
        hp.telfon(628121212);
        hp.kirimSMS(628131313);
        hp.kirimSMS(628121010, 628131010);

        System.out.println();

        laptop.informasi();
        laptop.bukaGame("Pokemon");
        laptop.kirimEmail("rafi@email.com");
        laptop.kirimEmail("rafi@mail.com", "ilzan@mail.com");
    }
}
