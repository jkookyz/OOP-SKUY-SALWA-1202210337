public class MainApp {

    public static void main (String[] arg) throws Exception{
        Perangkat p = new Perangkat("Adata", 2, 1.8f);
        p.Informasi();
        System.out.println();

        Laptop l = new Laptop("Seagate", 8, 2.40f, true);
        l.Informasi();
        l.BukaGame("Dota 2");
        l.KirimEmail("salwa@gmail.com");
        l.KirimEmail("bita@gmail.com", "zieza@gmail.com");
        System.out.println();

        Handphone h = new Handphone("Sandisk", 3, 2.20f, false);
        h.Informasi();
        h.Telfon(628521122);
        h.kirimSMS(62812212);
        h.kirimSMS(624121212, 629292211);

        }
}