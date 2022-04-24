package com.praktikum;

public class Main {

    public static void main(String[] args) {
        System.out.println("NAMA  : NUR AIDA ALFIYANTI");
        System.out.println("NIM   : 215150600111022");
        System.out.println("KELAS : PTI-A");

        System.out.println("======================== DATA PEKERJA ========================");
        Pekerja pkr1 = new Pekerja(7, 22, "195102439283", "Iqbal Biondy ", "351717969", true, true);
        System.out.println(pkr1.toString());
        System.out.println("======================== DATA PEKERJA ========================");
        Pekerja pkr2 = new Pekerja(8, 28, "201105003258", "Daffa Falah ", "257882921", true, false);
        System.out.println(pkr2.toString());
        System.out.println("======================== DATA PEKERJA ========================");
        Pekerja pkr3 = new Pekerja(9, 20, "213100223567", "Danila Putri", "566411981", false, true);
        System.out.println(pkr3.toString());

        System.out.println("\n");

        System.out.println("======================== DATA MANAJER ========================");
        Manajer man1 = new Manajer(9, 20, "115544367899", "Maura Ayu", "350511256676", false, false, 1500);
        System.out.println(man1.toString());
        System.out.println("======================== DATA MANAJER ========================");
        Manajer man2 = new Manajer(7, 26, "251627886577", "Agitha Zian ", "230566922111", false, true, 1600);
        System.out.println(man2.toString());
        System.out.println("======================== DATA MANAJER ========================");
        Manajer man3 = new Manajer(8, 24, "211188639267", "Ardi Audya ", "192876952452", true, true, 1200);
        System.out.println(man3.toString());

        System.out.println("\n");

        System.out.println("======================== DATA MAHASISWA ========================");
        MahasiswaFilkom mw1 = new MahasiswaFilkom("Dian Raditya", "456574338912", true, true, "215150600111215", 3.3);
        System.out.println(mw1.toString());
        System.out.println("======================== DATA MAHASISWA ========================");
        MahasiswaFilkom mw2 = new MahasiswaFilkom("Aneswari", "551268967721", false, false, "205150601111025", 3.7);
        System.out.println(mw2.toString());
        System.out.println("======================== DATA MAHASISWA ========================");
        MahasiswaFilkom mw3 = new MahasiswaFilkom("Fahru Setiawan", "261233689485", true, false, "195150607112226", 3.4);
        System.out.println(mw3.toString());
    }
}


