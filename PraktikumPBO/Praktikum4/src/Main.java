import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nama    :Nur Aida Alfiyanti");
        System.out.println("Nim     :215150600111022");

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));

        System.out.println("==== Selamat Datang Di UB FOOD ====");
        System.out.println("1. Data Merchant ");
        System.out.println("2. Tambah Merchant ");
        System.out.println("3. Cari Merchant ");
        System.out.println("4. Update Merchant ");
        System.out.print("Pilihan : ");
        int pilihan = sc.nextInt();

        switch (pilihan){
            case 1 :
                DataMerchant.tampilData();
                System.out.println();
                break;
            case 2 :
                sc.nextLine();
                System.out.println("Tambah Merchant : ");
                System.out.print("Nama Merchant     : ");
                String nama = sc.nextLine();
                System.out.print("Nama Produk       : ");
                String produk = sc.nextLine();
                System.out.print("Harga Makanan     : ");
                double harga = sc.nextDouble();
                DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant( nama, produk, harga));
                DataMerchant.tampilData();
                break;
            case 3 :
                sc.nextLine();
                System.out.print("Cari merchant   : ");
                String warung = sc.nextLine();
                DataMerchant.cariMerchant(warung);
                DataMerchant.tampilData();
                break;
            case 4 :
                sc.nextLine();
                System.out.print("Cari merchant   : ");
                String cari = sc.nextLine();
                System.out.print("Nama Merchant Baru : ");
                String namaBaru = sc.nextLine();
                System.out.print("Nama Produk Baru   : ");
                String produkBaru = sc.nextLine();
                System.out.print("Harga Baru         : ");
                double hargaBaru = sc.nextDouble();
                DataMerchant.updateMerchant(DataMerchant.cariMerchant(cari),namaBaru, produkBaru, hargaBaru);
                break;
            default:
        }

    }
}
