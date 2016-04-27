package bab5;
import java.util.Scanner;
public class MainJaket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil, jum;
        do {
            System.out.println("");
            System.out.println("===============MENU===============");
            System.out.println("1. Jaket A");
            System.out.println("2. Jaket B");
            System.out.println("3. Jaket C");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda   : ");
            bil = input.nextInt();
            switch (bil) {
                case 1: {
                    System.out.print("Masukkan Jumlah Jaket :   ");
                    jum = input.nextInt();
                    Jaket.beli1(jum);
                }
                break;
                case 2: {
                    System.out.print("Masukkan Jumlah Jaket :   ");
                    jum = input.nextInt();
                    Jaket.beli2(jum);
                }
                break;
                case 3: {
                    System.out.print("Masukkan Jumlah Jaket :   ");
                    jum = input.nextInt();
                    Jaket.beli3(jum);
                }
                break;
            }
        } while (bil != 4);
    }
}