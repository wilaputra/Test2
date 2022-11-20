public  class Mobil {
    static String warna ="Merah";
    static String merk ="Ferrari";
    protected static String pa ="Italia"; //pabrik asal
    private static String kecmobil="320km/jam";


    public static void maju() {
        System.out.println("Mobil "+merk+" Berwarna "+warna+" Bergerak maju");
    }

    public static void mundur(){
        System.out.println("Mobil "+merk+" Berwarna "+warna+" Bergerak mundur");
    }

    protected static void pabrikasal(){
        System.out.println(merk+" Berasal dari "+pa);
    }
    public static void kecepatanmob(){
        System.out.println("Maximal kecepatan Mobil mencapai : "+ kecmobil);
    }  //masih bisa dipanggil pada class main meskipun property private




}
