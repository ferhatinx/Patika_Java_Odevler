import  java.util.Scanner;

public class kdvhesaplama {
    public static void main(String[] args) {
        /*(Not : KDV tutarını 18% olarak alın)
        KDV'siz Fiyat = 10;
        KDV'li Fiyat = 11.8;
        KDV tutarı = 1.8;
          Ödev
           Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
            tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/
        Scanner input = new Scanner(System.in);
        double kdvorani=0.18,kdvoran2,newdeger,kdvtutar;
        System.out.print("Miktar Giriniz: ");
        double a =input.nextDouble();
        if (a>1000)
            kdvorani=0.8;

        newdeger = a+(a*kdvorani);
        kdvtutar = newdeger-a;

        System.out.println(newdeger);
        System.out.println(kdvtutar);


    }
}
