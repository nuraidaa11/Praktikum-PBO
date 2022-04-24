package com.praktikum;

public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;
    static int jml = 0;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
}
    public String getNama() {
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNIK(){
        return NIK;
    }
    public void setNIK(String NIK){
        this.NIK = NIK;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan(){
        if(isMenikah() == true && isJenisKelamin() == true){
            return 25;
        }else if(isMenikah() == false && isJenisKelamin() == true){
            return 20;
        } else{
            return 15;
        }
    }
    public double getPendapatan(){
        return getTunjangan();
    }
    public void getTotalManusia(){
        System.out.println(jml);
    }
    public String toString(){
        jml++;
        return "\nNama\t\t : " + getNama() +
                "\nNIK\t\t : " + getNIK() +
                "\nJenis Kelamin\t : " + (isJenisKelamin()?"Laki-laki" : "Perempuan") +
                "\nPendapatan\t\t : " + getPendapatan()  + "$" + "\n";
    }
}

