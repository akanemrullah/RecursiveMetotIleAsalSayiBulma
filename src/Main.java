import java.util.Scanner;

public class Main {

    // Asil sayi kontrolu icin Boolean tipinde metot tanimlanip gerekli mantiksal islemler yapildi.
    static boolean isPrimeNumber(int number, int tempNumber) {
        if (tempNumber == 1 || tempNumber == 0) {
            return true;
        } else if (number % tempNumber == 0) {
            return false;
        } else {
            return isPrimeNumber(number, tempNumber - 1);
        }
    }


    public static void main(String[] args) {
        // Kullanicidan veri almak ve bu verileri degiskenlerde saklamak icin scanner sinifi ve ilgili degiskenler tanimlandi.
        Scanner input = new Scanner(System.in);
        int number, tempNumber;

        // Kullanicidan deger alinip ilgili degiskenlere atandi.
        System.out.print("Asal sayi olup olmadigini kontrol etmek istedigin degeri gir: ");
        number = input.nextInt();
        tempNumber = number - 1;

        // Metotumuzdan gelen boolean degere gore gerekli ciktilar verildi.
        if (isPrimeNumber(number, tempNumber)) {
            System.out.println(number + " Sayisi bir asal sayidir..");
        } else {
            System.out.println(number + " Sayisi bir asal sayi degildir!!");
        }
    }
}