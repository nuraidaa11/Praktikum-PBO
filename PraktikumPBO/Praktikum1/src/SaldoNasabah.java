import java.util.Scanner;

public class SaldoNasabah {
    public static double hasil (double hasil1, double hasil2){
        double administrasi = 7000;
        double jumlah = (hasil1 + hasil2);
        jumlah = jumlah - administrasi;
        double bonus = jumlah * 0.0005;
        double jumlahUang = jumlah + bonus;
        return jumlahUang;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = sc.nextDouble();
        double setoran = sc.nextDouble();
        System.out.println(hasil (saldo, setoran));
    }
}
