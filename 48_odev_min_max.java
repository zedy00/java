
package pkg48_odev_min_max;

import java.util.Scanner;


public class Main {

  
    public static void main(String[] args) {
        
        
        int kacSayi,sayi,enb,enk;
        enb = -99999999;
        enk = 9999999;
       
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Kac sayi gireceksiniz :");
        kacSayi = input.nextInt();
        
        
        while(kacSayi>0){
            System.out.println("Bir sayı giriniz");
            sayi = input.nextInt();
            
            
            
            
            
            if(sayi>enb){
                enb = sayi;
            }
            if(sayi<enk){
                enk = sayi;
            
        }
            
            kacSayi--;
        }
        System.out.println("Girdiğiniz sayılar içinde ");
        System.out.println("En büyük =" + enb+"\nEn küçük =" + enk);
    }
    
}
