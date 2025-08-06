import java.util.Scanner;
public class not {
    public static void main(String[] args) {
        /* değişkenleri oluş;tur. mat , fizik, kimya , türkçe , tarih. müzik */
    
    Scanner mesaj = new Scanner(System.in);

    System.out.println("Türkçe dersi notunuzu giriniz : ");
    int turk;
    turk = mesaj.nextInt();


    System.out.println("Matematik dersi notunuzu giriniz :");
    int mat;
    mat = mesaj.nextInt();
    

    System.out.println("Fizik dersi notunuzu giriniz : ");
    int fizik ;
    fizik = mesaj.nextInt();


    System.out.println("Kimya dersi notunuzu giriniz : ");
    int kimya;
    kimya = mesaj.nextInt();


    System.out.println("Tarih dersi notunuzu giriniz : ");
    int tarih;
    tarih = mesaj.nextInt();


    System.out.println("Müzik dersi notunuzu giriniz : ");
    int müzik ;
    müzik = mesaj.nextInt();
    mesaj.close();



    int nottop = turk+mat+fizik+kimya+müzik+tarih;
    double ortalama = nottop/ 6.0;

    System.out.println("Not ortalamanız : " + ortalama);
    System.out.println(ortalama >= 59 ? "Sınıfı Geçti." : "Sınıfta Kaldı.");









    
  
  














    }
    
}
