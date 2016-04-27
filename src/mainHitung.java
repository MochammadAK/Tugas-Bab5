package bab5;
import java.util.Scanner;
public class mainHitung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hitung bill = new Hitung();
        int bil, bil1, bil2;
        do {
            System.out.println("");
            System.out.println("===============MENU===============");
            System.out.println("1. Penjumlahan    4. Pembagian");
            System.out.println("2. Pengurangan    5. Penyederhanaan Pecahan");
            System.out.println("3. Perkalian      0. Keluar");
            System.out.print("Pilihan Anda   : ");
            bil = input.nextInt();
            switch (bil){
                case 1:{
                    System.out.print("Masukkan Bilangan Pertama :   ");
                    bil1 = input.nextInt();
                    System.out.print("Masukkan Bilangan Kedua :   ");
                    bil2 = input.nextInt();
                    Hitung.jumlah(bil1, bil2);
                } break;
                case 2:{
                    System.out.print("Masukkan Bilangan pertama :   ");
                    bil1 = input.nextInt();
                    System.out.print("Masukkan Bilangan Kedua :   ");
                    bil2 = input.nextInt();
                    Hitung.kurang(bil1, bil2);
                } break;
                case 3:{
                    System.out.print("Masukkan Bilangan Pertama :   ");
                    bil1 = input.nextInt();
                    System.out.print("Masukkan Bilangan Kedua :   ");
                    bil2 = input.nextInt();
                    bill.kali(bil1, bil2);
                } break;
                case 4:{
                    System.out.print("Masukkan Bilangan Pertama :   ");
                    bil1 = input.nextInt();
                    System.out.print("Masukkan Bilangan Kedua :   ");
                    bil2 = input.nextInt();
                    bill.bagi(bil1, bil2);
                } break;
                case 5:{
                    System.out.print("Masukkan Penyebut :   ");
                    bil1 = input.nextInt();
                    System.out.print("Masukkan Pembilang :  ");
                    bil2 = input.nextInt();
                    bill.sederhana(bil1, bil2);
                }
            }
        } while (bil != 0);
    }
}