package bab5;
public class Hitung {
    private static double hasil;
    public static void jumlah(int a, int b){
        hasil = a + b;
        System.out.printf("Hasil Penjumlahan : %.0f",hasil);
    }
    public static void kurang(int a, int b){
        hasil = a - b;
        System.out.printf("Hasil Pengurangan : %.0f",hasil);
    }
    public void kali(int a, int b){
        hasil = a*b;
        System.out.printf("Hasil Perkalian : %.0f",hasil);
    }
    public void bagi (int a, int b){
        hasil = a/b;
        System.out.printf("Hasil Pembagian : %.0f",hasil);
    }
    public void sederhana (int a, int b){
        hasil = 0;
        int temp;
        if(a > b){
            if (a%b == 0){
                hasil = a/b;
                System.out.println("Hasil Pecahan : "+hasil);
            }
            else if(a%b == 1){
                hasil = a/b;
                temp = a%b;
                System.out.printf("Hasil Pecahan : %d(%d/%d", hasil, temp, b);
            }
        }
        else if(a < b){
            if (b%a == 0){
                hasil = b/a;
                System.out.println("Hasil Pecahan : 1/"+hasil);
            }
            else if(b%a == 1){
                System.out.printf("Hasil Pecahan : %d/%d", a, b);
            }
        }
        System.out.println("Hasil Penyederhanaan : ");
    }
    
}

