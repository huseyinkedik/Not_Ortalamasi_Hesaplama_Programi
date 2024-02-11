import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değiskenleri olustur
        int mat, fizik, turkce, kimya, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan veri al

        System.out.print("Matematik notunu girin:");
        mat = inp.nextInt();

        System.out.print("Fizik notunu girin:");
        fizik = inp.nextInt();

        System.out.print("Türkçe notunu girin:");
        turkce = inp.nextInt();

        System.out.print("Kimya notunu girin:");
        kimya = inp.nextInt();

        System.out.print("Tarih notunu girin:");
        tarih = inp.nextInt();

        System.out.print("Müzik notunu girin:");
        muzik = inp.nextInt();

        double toplam = (mat + fizik + turkce + kimya + tarih + muzik) / 6.0;
        boolean sonuc = toplam > 60;
        String str = sonuc ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.print(str);


    }
}