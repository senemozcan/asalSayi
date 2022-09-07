import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        for (int i = 2; i < sayi; i++) {
            if(sayi%i == 0){
                System.out.println(sayi + "asal sayı değildir");
            }
            else{
                System.out.println(sayi + "asal sayıdır");
            }
            break;

        }
    }
}