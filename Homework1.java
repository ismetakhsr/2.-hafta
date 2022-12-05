/*
1) Başla
2)Üçgenin taban uzunluğunu gir
3)Üçgenin taban uzunluğu = a
4)Üçgenin taban kenarına inen uzunluğu gir
5)Üçgenin taban kenarına giren uzunluk = b
6)Üçgenin alanı (a*b)/2
7)Sonucu göster
8)Bitir
*/


package homework.pkg1;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class Homework1 {

    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) {
    // üçgenin alanını bulunuz
    Scanner scan = new Scanner (System.in);
    System.out.println("Üçgenin taban kenar uzunluğunu giriniz");
    int a = scan.nextInt();
    System.out.println("Taban kenara inen yükseklik uzunluğunu giriniz");
    int b = scan.nextInt();
    System.out.println("Üçgenin alanı = " + (a*b)/2 );
    
        
    }
    
}
