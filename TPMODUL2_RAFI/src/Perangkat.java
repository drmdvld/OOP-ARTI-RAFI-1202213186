public class Perangkat {
        protected String drive;
        protected int ram;
        protected float processor;
    
        public Perangkat(String drives, int rams, float processors) {
            this.drive = drives;
            this.ram = rams;
            this.processor = processors;
        }
    
        public void informasi() {
            System.out.println("Perangkat tidak diketahui memiliki tipe " + drive + " dengan ram sebesar " + ram
                    + " GB dan processor secepat " + processor + " Ghz");
}
}
