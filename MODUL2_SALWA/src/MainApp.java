public class MainApp {

    public static void main(String[]arg)throws Exception{
        TransportasiAir T = new TransportasiAir(4, 20000);
        T.informasi();
        T.berlayar();
        T.berlabuh();
        System.out.println();

        Sampan S = new Sampan(20, 50000, 2);
        S.informasi();
        S.berlayar();
        S.berlabuh();
        S.berlabuh(2);
        System.out.println ();

        Kapal K = new Kapal(50, 100000, "Diesel");
        K.informasi();
        K.berlayar();
        K.berlayar(20);
        K.berlabuh();
        System.out.println( );
    }
    
}
