import java.util.Scanner;

public class MenghitungLuas {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    int sisi = sc.nextInt();
                    Persegi per1 = new Persegi(sisi);
                    per1.printLuas1();
                    break;

                case 2:
                    int alas = sc.nextInt();
                    int tinggi = sc.nextInt();
                    Segitiga se1 = new Segitiga(alas, tinggi);
                    se1.printLuas2();
                    break;

                case 3:
                    double r = sc.nextDouble();
                    Lingkaran ling1 = new Lingkaran(r);
                    ling1.printLuas3();
                    break;

                default:
                    System.out.println("Input yang anda masukan tidak sesuai");
            }

        }
}

    class Persegi{
        int sisi, luas;

        Persegi(int sisi){
            this.sisi = sisi;
        }

        public int Persegi(int sisi){
            luas = sisi * sisi;
            return luas;
        }

        public void printLuas1(){
            System.out.println(Persegi(sisi));
        }
    }

    class Segitiga{
        int alas, tinggi, luas;

        Segitiga(int alas, int tinggi){
            this.alas = alas;
            this.tinggi = tinggi;
        }
        public int Segitiga (int alas, int tinggi){
            luas = alas * tinggi/2;
            return luas;
        }
        public void printLuas2(){
            System.out.println(Segitiga(alas, tinggi));
        }
    }
    class Lingkaran{
        double r, luas;

        Lingkaran(double r){
            this.r = (int) r;
        }

        public double Lingkaran (double r){
            if(r % 7 == 0){
                luas = (int) (22/7 * r * r);
            } else {
                luas = (int) (3.14 * r * r);
            }
            return luas;
        }
        public void printLuas3(){
            System.out.println(Lingkaran(r));
        }
}
