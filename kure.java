/*
1)Başla
2)Küreye ait yarıçap uzunluğunu tanımlayınız
3)Küreye ait yarıçap uzunluğunun değeri = a
4)Kullanmak istediğiniz pi ifadesini tanımlayınız
5)Kullanmak istediğiniz pi ifadesinin değeri = b
6)c ifadesinin değeri = 4 , d ifadesinin değeri =(4/3)
7)Kürenin alanı = c*b*(a*a)
8)Kürenin hacmi = (c*b*a*a*a)/3
9)Sonuç göster
10)Bitir
 
 */
package homework.pkg1;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class kure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner (System.in);
    System.out.println("Küreye ait yarıçap uzunluğunu yazınız");
    double a = scan.nextDouble();
    System.out.println("Kullanmak istediğiniz pi ifadesini giriniz");
    double b = scan.nextDouble();
    double c = 4 ;  
    double d = (4/3);
    System.out.println("Kürenin alanı = " + c*b*(a*a) ); 
    System.out.println("Kürenin hacmi = " + (c*b*a*a*a)/3 );
    
    
    
    
    
    }
    
}
