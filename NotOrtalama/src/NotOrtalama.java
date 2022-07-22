import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {


        int Mat,Fiz,Kim,Tur,Tar,Muz,ortalama;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notu giriniz: ");
        Mat =input.nextInt();
        System.out.print("Fizik Notu giriniz: ");
        Fiz =input.nextInt();
        System.out.print("Kimya Notu giriniz: ");
        Kim =input.nextInt();
        System.out.print("Türkçe Notu giriniz: ");
        Tur =input.nextInt();
        System.out.print("Tarih Notu giriniz: ");
        Tar =input.nextInt();
        System.out.print("Müzik Notu giriniz: ");
        Muz =input.nextInt();
        ortalama = (Mat + Fiz + Kim + Tar + Tur + Muz) / 6;
        String sonuc = ortalama<=60 ? "Kaldı":"Geçti";
        System.out.println("Sonuc" + sonuc);
    }
}
