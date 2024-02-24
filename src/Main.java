import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("n Sayısını Giriniz: ");
        double n= input.nextDouble();
        System.out.println("r Sayısını Giriniz: ");
        double r= input.nextDouble();
        double total1 = 1, total2 = 1,total3 = 1,k;
        k=n-r;


        for(double i = 1; i<=n; i++) {
            total1 = total1 *i;
        }
        for (double i = 1; i<=k; i++){
            total2 = total2 * i;
        }
        for (double i = 1; i<=r; i++){
            total3 = total3 * i;
        }
        System.out.println("Kombinasyon Sonucu: "+ (total1/(total3*total2)));
    }
}