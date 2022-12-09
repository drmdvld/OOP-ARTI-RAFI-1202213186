public class Main {
    public static void main(String[] args) throws Exception {
        
        TransportasiAir ta = new TransportasiAir(4, 20000);
        ta.informasi();
        ta.berlayar();
        ta.berlabuh();

        Sampan spn = new Sampan(20, 50000, 2);
        spn.informasi();
        spn.berlayar();
        spn.berlabuh();
        spn.berlabuh(2);

        Kapal kpl = new Kapal(50, 100000, "Diesel");
        kpl.informasi();
        kpl.berlayar();
        kpl.berlayar(20);
        kpl.berlabuh();
    }
}
