public class Handphone extends Perangkat{
    protected boolean fingerprint;

    public Handphone (String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void Informasi(){
        if (this.fingerprint == true){
            System.out.println("Handphone ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+"GB dan processor secepat "+processor+ "Ghz. Selain itu laptop ini juga memiliki fingerprint");
        } else {
            System.out.println("Handphone ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+"GB dan processor secepat "+processor+ "Ghz. Selain itu laptop ini TIDAK memiliki fingerprint");
        }
    
    }

    public void Telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke No "+no_hp);
    }      
    public void kirimSMS(int no_hp) {
        System.out.println("Handphone berhasil mengirim SMS ke No "+ no_hp );
    }
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp1 +" dan ke " +no_hp2);
    }


}
