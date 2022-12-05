/*
1)Başla
2)Derece cinsinden girmek istediğiniz açıyı giriniz
3)Derece cinsinden girdiğiniz açını değeri = a
4)Kullandığınız pi sayısını tanımlayınız
5)Kullandığınız pi sayısının değeri = b
6)Derece cinsinden girdiğiniz açının radyan değeri = (a/b)
7) c sayısının değeri = 10 , d sayısının değeri = 9
8)Derece cinsinden girdiğiniz açının grad değeri = (a*c)/d
9)Sonuç göster
10)Bitir


 */
package homework.pkg1;
import java.util.Scanner ;
/**
 *
 * @author Toshiba
 */
public class açı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
     System.out.println("Girmek istediğiniz açıyı derece cinsinden yazınız");
     double a = scan.nextDouble();
     System.out.println("Kullanacağınız pi sayısının derece değerini tanımlayınız");
     double b = scan.nextDouble();  
     System.out.println("Yazdığınız derecenin radyan değeri = " + (a/b) );
     int c = 10 ;
     int d = 9 ;
     System.out.println("Yazdığınız derecenin grad değeri = " + (a*c)/d );
     
             
     
        
    }
    
}
