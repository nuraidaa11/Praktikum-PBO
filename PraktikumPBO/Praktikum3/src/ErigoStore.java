import java.util.Scanner;

public class ErigoStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
        System.out.print("Baju yang akan anda beli bertipe      : ");
        String jenis = sc.nextLine();
        System.out.print("Jumlah baju yang akan anda beli adalah: ");
        int jumlah = sc.nextInt();
        Baju erigo = new Baju(jenis,jumlah);
        erigo.display();
        System.out.println("Nama    : Nur Aida Alfiyanti");
        System.out.println("NIM     : 215150600111022");
        System.out.println("Kelas   : PTI-A");
    }
}

class Baju {
    String jenis;
    int harga;
    int jumlah;

    public Baju(String jenis, int jumlah) {
        this.jenis = jenis;
        this.jumlah = jumlah;
    }

    final int bajuA = 100000;
    final int bajuB = 125000;
    final int bajuC = 175000;

    void hargaA() {
        if (jumlah > 100) {
            harga = 95000;
        } else {
            harga = bajuA;
        }
    }

    void hargaB() {
        if (jumlah > 100) {
            harga = 120000;
        } else {
            harga = bajuB;
        }
    }

    void hargaC() {
        if (jumlah > 100) {
            harga = 160000;
        } else {
            harga = bajuC;
        }
    }

    void display() {
        if (jenis.equalsIgnoreCase("a"))
            hargaA();
        else if (jenis.equalsIgnoreCase("b"))
            hargaB();
        else if (jenis.equalsIgnoreCase("c"))
            hargaC();

        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total harga          : " + harga * jumlah);
    }
}
