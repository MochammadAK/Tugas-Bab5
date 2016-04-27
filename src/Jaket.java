package bab5;
public class Jaket {
    private final static double jak1 = 100000;
    private final static double jak2 = 125000;
    private final static double jak3 = 175000;
    public static double harga;
    
    public static void beli1(int jum){
        harga = 0;
        if(jum > 100){
            harga = 95000 * jum;
            System.out.println("Anda Mendapat Diskon Sebesar Rp5.000,- per buah");
            System.out.printf("Total Harga :   %.0f", harga);
        }
        else if(jum <= 100){
            harga = jak1 * jum;         
            System.out.printf("Total Harga :   %.0f", harga);
        }
    }
    public static void beli2(int jum){
        harga = 0;
        if(jum > 100){
            harga = 120000 * jum;
            System.out.println("Anda Mendapat Diskon Sebesar Rp5.000,- per buah");
            System.out.printf("Total Harga :   %.0f", harga);
        }
        else if(jum <= 100){
            harga = jak2 * jum;
            System.out.printf("Total Harga :   %.0f", harga);
        }
    }
    public static void beli3(int jum){
        harga = 0;
        if(jum > 100){
            harga = 160000 * jum;
            System.out.println("Anda Mendapat Diskon Sebesar Rp15.000,- per buah");
            System.out.printf("Total Harga :   %.0f", harga);
        }
        else if(jum <= 100){
            harga = jak3 * jum;
            System.out.printf("Total Harga :   %.0f", harga);
        }
    }
}