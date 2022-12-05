/*
1)Başla
2)Cismin kütlesini tanımlayınız
3)Cismin kütlesinin değeri = a
4)Cismin hızını tanımlayınız
5)Cismin hızının değeri = b
6)Cismin yerden yüksekliğini tanımlayınız
7)Cismin yerden yüksekliğinin değeri = c
8)Cismin bulunduğu ortamın yerçekimi ivmesini tanımlayınız
9)Cismin bulunduğu ortamın yerçekimi ivmesinin değeri = d
10)Cismin kinetik enerjisi = (a*b*b)/2 )
11)Cismin esneksel potansiyel enerjisi = a*d*c
12) Sonuç göster
13) Bitir

 
 */
package homework.pkg1;

import java.util.Scanner;



/**
 *
 * @author Toshiba
 */
public class enerjı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Cismin kütlesini giriniz");
        double a = scan.nextDouble(); 
        System.out.println("Cismin hızını giriniz ");
        double b = scan.nextDouble();
        System.out.println("Cismin yerden yüksekliğini giriniz");
        double c = scan.nextDouble();
        System.out.println("Cismin bulunduğu ortamın yerçekimi ivmesini giriniz");
        double d = scan.nextDouble();
        System.out.println("Cismin kinetik enerjisi = " + (a*b*b)/2 );
        System.out.println("Cismin esneksel potansiyel enerjisi = " + a*d*c );
        
        
        
        
        
        
     
     
     
     
        
    }
    
}
