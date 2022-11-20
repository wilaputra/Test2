public class Motor {
    static String warna ="Merah";
    static String merk ="Ducatti";
    protected static String pa ="Italia";    //pabrik asal
    private static String kecmotor ="358,5km/jam";


    public static void majumotor(){
        System.out.println("Motor "+merk+" berwarna"+warna+" bergerak maju");
    }

    public static void mundurmotor(){
        System.out.println("Motor "+merk+" berwarna"+warna+" bergerak mundur");
    }
    protected static void pabrikasal(){
        System.out.println("Motor "+merk+" Berasal dari "+pa);
    }
    public static void kecepatanmotor(){
        System.out.println("Maximal kecepatan motor mencapai : " +kecmotor);
    }
}
