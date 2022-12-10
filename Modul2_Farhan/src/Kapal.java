public class Kapal  extends TransportasiAir{
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;

    }

    public void informasi(){
        System.out.println("Transportasi Air jenis kapal dengan kursi berjumlah" + jumlahKursi + "ditetapkan biaya sebesar Rp. " +biaya);
        System.out.println("Transportasi Air jenis kapal sedang berlayar menggunakan mesin" + mesin + "dengan kecepatan yang tidak stabil");
    }

    public void berlayar(){
        System.out.println("Transportas Air dengan jeni yang tidak diketahui sedang berlayar");

    }

    public void berlayar (int kecepatan){
        System.out.println("Transportasi Air jenis kapal sedang berlayar menggunakan mesin Diesel dengan kecepatan stabil di kisaran" + kecepatan + "knot");
    }

    public void berlabuh(){
        System.out.println("Transportasi Air jenis kapal berlabuh di pantai");
    }
    
}
// Terdapat 4 Method Public yaitu informasi(), berlayar(), berlayar(int kecepatan),
// berlabuh()
