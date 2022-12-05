/*
1)Başla
2)Çembersel hareket yapan cismin kütlesini tanımlayınız
3)Çembersel hareket yapan cismin kütlesinin değeri = a 
4)Çembersel hareket yapan cismin hızını tanımlayınız
5)Çembersel hareket yapan cismin hızının değeri = b
6)Çemberin yarıçapını tanımlayınız
7)Çemberin yarıçapının değeri = c
8)Çembersel hareket yapan cismin merkezcil kuvveti = a*b*b*c
9)Çembersel hareket yapan cismin merkezcil ivmesi = (b*b)/c 
10) Sonuç göster
11) Bitir


 */
package homework.pkg1;
import java.util.Scanner ;

/**
 *
 * @author Toshiba
 */
public class çemberselhareket {

    /**
     * @param args the command line arguments
     */
    // çembersel hareket yapan cismin merkezcil ivmesi ve merkezcil kuvveti
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in) ;
    System.out.println("Çembersel hareket yapan cismin kütlesi");
    double a = scan.nextDouble();
    System.out.println("Çembersel hareket yapan cismin hızı");
    double b = scan.nextDouble();
    System.out.println("Çemberin yarıçapını giriniz");
    double c = scan.nextDouble();
    System.out.println("Çembersel hareket yapan cismin merkezcil kuvveti = " + a*b*b*c);
    System.out.println("Çembersel hareket yapan cismin merkezcil ivmesi = " + (b*b)/c );
    
    
   
    
     
        
    }
    
}
