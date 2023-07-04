import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int r;
       double pi=3.14;

       Scanner input =  new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz: "); //kullanıcıdan daire yarıçapını alır
       r= input.nextInt();
       double alan = pi*r*r; //alınan yarıçapa göre daire alanı
       double cevre = 2*pi*r; //alınan yarıçapa göre daire çevresi

        System.out.println("Daire alanı :" +alan);
        System.out.println("Daire cevresi :" +cevre);

        int a; //daire diliminin açısını kullanıcıdan alacağız
        double dilimAlani;

        Scanner alfa = new Scanner(System.in);
        System.out.println("Daire diliminin açısını giriniz : ");
        a = alfa.nextInt();
        dilimAlani = (pi*r*r*a)/360; //dilim alanı alınan açı ve yarıçap ile
        System.out.println("Daire dilim alanı :" + dilimAlani);

    }
}