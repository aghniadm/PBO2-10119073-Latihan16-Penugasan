package pbo2.pkg10119073.latihan16.penugasan;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk mengimplementasikan
 * penugasan
 *
 */
public class PBO210119073Latihan16Penugasan {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c+"\n");
        
        c = a + b;
        System.out.println("c = a + b =  " + c);
        c += a;
        System.out.println("c += a =  " + c);
        c -= a;
        System.out.println("c -= a =  " + c);
        c *= a;
        System.out.println("c *= a =  " + c);
        
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a =  " + c);
        
        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a =  " + c);
        c <<= 2;
        System.out.println("c <<= 2 =  " + c);
        c >>= 2;
        System.out.println("c >>= 2 =  " + c);
        c >>= 2;
        System.out.println("c >>= a =  " + c);
        c &= a;
        System.out.println("c &= 2 =  " + c);
        c ^= a;
        System.out.println("c ^= a =  " + c);
        c |= a;
        System.out.println("c |= a =  " + c);   
    }
    
}
