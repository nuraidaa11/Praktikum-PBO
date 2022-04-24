package com.praktikum;

public class Pekerja extends Manusia{
   private double gaji;
   private double bonus;
   private int jamKerja;
   private int hariKerja;
   private String NIP;
   static int jml2 = 0;

   public Pekerja( int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah){
       super(nama, NIK, jenisKelamin, menikah);
       this.jamKerja = jamKerja;
       this.hariKerja = hariKerja;
       this.NIP = NIP;
   }
    public double getGaji(){
       return gaji;
    }
    public void setGaji(double gaji){
       this.gaji = gaji;
    }
    public double getBonus(){
        return bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public int getJamKerja(){
       return jamKerja;
    }
    public void setJamKerja(int jamKerja){
       this.jamKerja = jamKerja;
    }
    public int getHariKerja(){
        return hariKerja;
    }
    public void setHariKerja(int hariKerja){
        this.hariKerja = hariKerja;
    }
    public String getNIP(){
       return NIP;
    }
    public void setNIP(String NIP){
       this.NIP = NIP;
    }
    public double gaji(){
       return (getHariKerja() * getJamKerja() * 15);
    }
    public double bonusPekerja(){
       double gajiLembur = ((getHariKerja()/7) * 7 + (getHariKerja() & 7)) * (getJamKerja() - 7) * 5;
       double gajiLibur = ((getHariKerja()/7) * 2 * getJamKerja() * 20);

       if(getJamKerja()<= 7){
           return gajiLibur;
       }else{
           return gajiLembur + gajiLibur;
       }
    }

    public String getStatus(){
        String departemen = "";
        String kantorCabang = switch (NIP.substring(0, 1)) {
            case "1" -> "Mondstadt";
            case "2" -> "Liyue";
            case "3" -> "Inazuma";
            case "4" -> "Sumeru";
            case "5" -> "Fontaine";
            case "6" -> "Natlan";
            case "7" -> "Snezhnaya";
            default -> "";
        };
        switch (NIP.substring(6, 7)) {
            case "1" -> departemen = "Pemasaran";
            case "2" -> departemen = "Humas";
            case "3" -> departemen = "Riset";
            case "4" -> departemen = "Teknologi";
            case "5" -> departemen = "Personalia";
            case "6" -> departemen = "Akademik";
            case "7" -> departemen = "Administrasi";
            case "8" -> departemen = "Operasional";
            case "9" -> departemen = "Pembangunan";
        }
        return departemen + ", " + kantorCabang + " cabang ke- " + NIP.substring(2,3);

    }

    public String toString(){
       jml2++;
       return  "\nNama            : " + getNama() +
               "\nNIK             : " + getNIK() +
               "\nJenis Kelamin   : " + (isJenisKelamin()?"Laki-laki" : "Perempuan") +
               "\nPendapatan      : " + (gaji() + bonusPekerja() + getTunjangan())  +
               "\nGaji            : " + gaji()+
               "\nBonus           : " + bonusPekerja() +
               "\nStatus          : " + getStatus();
    }

}
