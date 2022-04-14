import java.util.Scanner;

public class SuratKaisar {
    static String pergeseran (String teks, int bil) {
        String hasilSurat = "";
        char abjad;
        int i = 0;

        do{
            abjad = teks.charAt(i);
            if(abjad >= 'a' && abjad <= 'z') {
                abjad = (char) (abjad + bil);
                if(abjad > 'z') {
                    abjad = (char) (abjad+'a'-'z'-1);
                }
                hasilSurat += abjad;
            } else if(abjad >= 'A' && abjad <= 'Z') {
                abjad = (char) (abjad + bil);
                if(abjad > 'Z') {
                    abjad = (char) (abjad +'A'-'Z'-1);
                }
                hasilSurat += abjad;
            } else {
                hasilSurat += abjad;
            } i++;
        } while (i<teks.length());

        return hasilSurat;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String teks = sc.nextLine();
        int bil = sc.nextInt();
        System.out.println(pergeseran(teks,bil));
    }
}
