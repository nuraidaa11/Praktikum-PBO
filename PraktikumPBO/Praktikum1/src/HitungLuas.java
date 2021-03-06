import java.util.Scanner;

public class HitungLuas {
    public static int persegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    }

    public static int segitiga (int alas, int tinggi){
        int luas = alas * tinggi/2;
        return luas;
    }

    public static double lingkaran (double r){
        if(r % 7 == 0){
            double luas = 22/7 * r * r;
            return luas;
        } else {
            double luas = 3.12 * r * r;
            return luas;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan = sc.nextInt();

        switch (pilihan){
            case 1 :
                int sisi = sc.nextInt();
                System.out.println(persegi(sisi));
                break;

            case 2 :
                int alas = sc.nextInt();
                int tinggi = sc.nextInt();
                System.out.println(segitiga(alas, tinggi));
                break;

            case 3 :
                double r = sc.nextDouble();
                double luas1 = lingkaran(r);
                int luas2 = (int) Math.round(luas1);
                double luas3 = (double) luas2;
                System.out.println(luas3);
                break;

            default:
                System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}
