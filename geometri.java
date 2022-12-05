/*
1)Başla
2) a sayısının değeri = 180 , b sayısının değeri = 2
3)Kenar sayısını tanımlayınız
4)Kenar sayısının değeri = c
5)Düzgün çokgenin iç açılarının toplamı = a*(c-2)
6)Düzgün çokgenin bir açısının ölçüsü = ( a*(c-2) )/c
7)Sonuç göster
8)Bitir
 
 */
package homework.pkg1;
import java.util.Scanner;


public class geometri {

    /**
     * @param args the command line arguments
     */
    // kenar sayısı bilinen düzgün çokgenin her bir açısının ölçüsü ve toplam iç açılarının toplamı
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int a = 180;
    int b = 2 ;
    System.out.println("Kenar sayısını tanımlayınız ");
    int c = scan.nextInt();
    System.out.println("Düzgün çokgeninizin iç açılarının toplamı = " + a*(c-2) );
    System.out.println("Düzgün çokgeninizin bir açısının ölçüsü = " + ( a*(c-2) )/c  );
    
    
    
    
    
            
    
    
    
            
    }
    
}
