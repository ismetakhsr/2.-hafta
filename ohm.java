/*
1)Başla
2)İletken bir devredeki direnç değerini tanımlayınız
3)İletken bir devredeki direncin değeri = a
4)Devreye verilen akım değerini tanımlayınız
5)Devreye verilen akımın değeri = b
6)İki uç arasındaki gerilim değeri = a*b
7)Sonuç göster
8)Bitir
 */
package homework.pkg1;
 import java.util.Scanner ;

/**
 *
 * @author Toshiba
 */
public class ohm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println("İletken bir devredeki direnç değerini giriniz");
    double a = scan.nextDouble();
    System.out.println("Devreye verilen akım değerini giriniz");
    double b =  scan.nextDouble();
    System.out.println("İki uç arasındaki gerilim değeri = " + a*b );
    
    
    
   
    }
    
}
