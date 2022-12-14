public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    @Override
    public void Informasi(){
        if(this.webcam == true){
            System.out.println("Laptop ini memiliki drive tipe " +drive + " dengan ram sebesar " +ram+"GB dan processor secepat " + processor+ "Ghz. selain itu laptop ini juga memiliki webcam");
        }else{
            System.out.println("Laptop ini memiliki drive tipe " +drive + " dengan ram sebesar " +ram+"GB dan processor secepat " + processor+ "Ghz. selain itu laptop ini TIDAK memiliki webcam");
        }
    }
    public void BukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }
    public void KirimEmail(String email){
        System.out.println("Laptop berhasil mengirim email ke " + email);
    }
    public void KirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim email ke "+ email1 + " dan ke " + email2);
    }
}
