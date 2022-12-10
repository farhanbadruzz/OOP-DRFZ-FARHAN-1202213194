public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;

    }

    
        public void informasi(){
            System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah" + jumlahKursi + "ditetapkan dengan biaya sebsar Rp." +biaya);
            System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunakan" + layar + "layar");
            }

        public void berlayar(String jangkar){
            System.out.println();
        }

        public void berlabuh(){
            System.out.println();
        }

        public void berlabuh(int jangkar){
            System.out.println();
        }

}
