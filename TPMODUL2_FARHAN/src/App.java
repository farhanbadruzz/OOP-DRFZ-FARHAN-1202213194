public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Class Perangkat");

        Perangkat perangkat = new Perangkat("Kingston", 64, 3.1F);
        perangkat.informasi();
        System.out.println();

        Laptop laptop = new Laptop("Corsair", 1024, 5.6F, false);
        laptop.informasi();
        laptop.bukaGame("GTA VI");
        laptop.kirimEmail("badruzzamanmochamadfarhan@gmail.com");
        laptop.kirimEmail("nadinenurfaaza@gmail.com", "macarasabrinasacha@gmail.com");
        System.out.println();

        Handphone handphone = new Handphone("Antutu", 32, 5.4F, true);
        handphone.informasi();
        handphone.telfon(812345678);
        handphone.kirimSMS(812345678);
        handphone.kirimSMS(89876543, 812345678);
    }
}
