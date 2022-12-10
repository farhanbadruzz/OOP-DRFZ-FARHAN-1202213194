public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Class TransportasiAir");

        TransportasiAir transportasiAir = new TransportasiAir(4, 20000);
        transportasiAir.informasi();
        System.out.println();

        Sampan sampan = new Sampan(20, 50000, 2);
        sampan.informasi();
        sampan.berlayar("tanpa");
        sampan.berlabuh();
        sampan.berlabuh(2);


        Kapal kapal = new Kapal(50, 10000, "Diesel");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(20);
        kapal.berlabuh();
    }
}
