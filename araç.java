/*
1)Başla
2)Aynı yönde ileriden giden yavaş aracın hızını tanımlayınız
3)Yavaş giden aracın hızının değeri = a
4)Aynı yönde ileriden giden hızlı aracın hızını tanımlayınız
5)Hızlı giden aracın hızının değeri = b
6)Gidilen yolun uzunluğunu tanımlayınız
7)Gidilen yolun uzunluğunun değeri = c
8)Hızlı aracın yavaş aracı yakalama süresi  = c/(b-a)
9)Sonuç göster
10)Bitir
 */
package homework.pkg1;
import java.util.Scanner ;

/**
 *
 * @author Toshiba
 */
public class araç {

    /**
     * @param args the command line arguments
     */
    // yol ve hızı verilen iki aracın birbirini yakalama süresi
    public static void main(String[] args) {
    Scanner scan = new Scanner  (System.in);
    System.out.println("Aynı yönde ileriden giden yavaş aracın hızı");
    double a = scan.nextDouble();
    System.out.println("Aynı yönde geriden gelen hızlı aracın hızı");
    double b = scan.nextDouble();
    System.out.println("Gidilen yolun uzunluğu");
    double c = scan.nextDouble();
    System.out.println("Hızlı aracın yavaş aracı yakalama süresi  = " + c/(b-a) );
    
    
    
    
    }
    
}
