import java.util.Scanner;

//Maulana Ishaq (21102079) Prodi SK
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Motor motor = new Motor();
        Mobil mobil =new Mobil();



        System.out.println("Masukkan namamu");
        String UN = scanner.nextLine();
        System.out.println("Halo " + UN +" Ini adalah contoh program OOP sederhana ");
        System.out.println("yang akan menampilkan informasi tentang motor dan mobil");


        System.out.println("1.Mobil");
        System.out.println("2.Motor");
        System.out.println("Masukkan pilihan mu :");
        int pilihan = scanner.nextByte();

        if (pilihan == 1){
            System.out.println("Kamu memilih mobil maka : ");

            Mobil.maju();
            Mobil.mundur();
            Mobil.pabrikasal();
            Mobil.kecepatanmob();

        }
        else if (pilihan == 2){
            System.out.println("Kamu memilih motor maka : ");

            Motor.majumotor();
            Motor.mundurmotor();
            Motor.pabrikasal();
            Motor.kecepatanmotor();

        }
        else {
            System.out.println("Maaf pilihan yang anda maksud tidak terdaftar");
        }




    }
}