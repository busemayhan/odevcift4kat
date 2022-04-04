package Giris;
import java.util.Scanner;
public class OdevCift4kat {
    public static void main(String[] args) {
        int n;
       // Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        // ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        int total=0;
        Scanner scan=new Scanner(System.in);
        do {
            System.out.println("sayı giriniz: ");
            n = scan.nextInt();
            if ((n % 2 == 0) && (n % 4 == 0)) {
                total+=n;

            }
        }while(n%2==0);
        System.out.println("toplam"+total);

    }
}
