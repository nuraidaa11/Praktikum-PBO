public class DataMerchant {
    static Merchant[] merc = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merchant) {
        Merchant[] mch = new Merchant[DataMerchant.merc.length + 1];
        for (int i = 0; i < DataMerchant.merc.length; i++) {
            mch[i] = DataMerchant.merc[i];
        }
        mch[DataMerchant.merc.length] = merchant;
        return mch;
    }

    public static void tampilData() {
        for (Merchant mch1 : merc) {
            System.out.println("==== Tampilan Data Merchant UBFood ====");
            System.out.println("Nama Merchant  : " + mch1.getNamaMerchant());
            System.out.println("Nama Produk    : " + mch1.getNamaProduk());
            System.out.println("Harga          : " + (int) mch1.getHargaMakanan());
        }
    }
    public static Merchant cariMerchant(String warung){
        for(int i = 0; i < DataMerchant.merc.length; i++){
            if(warung.equalsIgnoreCase(DataMerchant.merc[i].getNamaMerchant())){
                return DataMerchant.merc[i];
            }
        }
        return null;
    }
    public static void updateMerchant( Merchant cari, String namaBaru, String produkBaru, double hargaBaru){
        cari.setNamaMerchant(namaBaru);
        cari.setNamaProduk(produkBaru);
        cari.setHargaMakanan(hargaBaru);
        System.out.println();
        System.out.println("==Data Hasil Update==");
        tampilData();

    }
}
