public class Handphone extends Perangkat {
    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    
    public void informasi(){
        System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan RAM sebesar " + ram + " GB dan processor secepat " + processor + "Ghz");
        System.out.println("Apakah Handphone ini dilengkapi dengan fitur fingerprint? " + fingerprint);
    }

    public void telfon(int no_hp){
        System.out.println("Handphone telah menyambungkan ke no " + no_hp);
    }

    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke nomor " + no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke nomor " + no_hp1 + " dan juga ke nomor " + no_hp2);
    }
}
