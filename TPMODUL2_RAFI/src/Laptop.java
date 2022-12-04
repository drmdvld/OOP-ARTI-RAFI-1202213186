public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi() {
        System.out.println("Laptopp ini memiliki drive tipe" + " " + drive + " " + "dengan ram sebesar " + ram
                + " " + "GB dan processor secepat" + " " + processor + " " + "Ghz. " + "Selain itu Laptop ini "
                + (webcam == false ? "Tidak memiliki " : "memiliki ") + "webcam");
    }

    public void bukaGame(String namaGame) {
        System.out.println("Laptop berhasil membuka game " + namaGame);
    }

    public void kirimEmail(String email) {
        System.out.println("Laptop berhasil mengirim email ke " + email);
    }

    public void kirimEmail(String email, String otherEmail) {
        System.out.println("Laptop berhasil mengirim email ke " + email + " " + "dan ke " + otherEmail);
    }
}
