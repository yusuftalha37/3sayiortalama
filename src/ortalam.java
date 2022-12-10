import java.util.Scanner;
public class ortalam {
    public static void main(String[] args) {
        System.out.println("3 Adet sayı giriniz");
        int sayı1,sayı2,sayı3;
        Scanner input = new Scanner(System.in);
        sayı1= input.nextInt();
        sayı2= input.nextInt();
        sayı3= input.nextInt();

        int sonuç = sayı1+sayı2+sayı3;
        int cevaP = sonuç/3;
        System.out.println(cevaP);
    }
}
