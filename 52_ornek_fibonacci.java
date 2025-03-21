
package pkg52_fibonacci_serisi;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        int sayi ;
        int toplam = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz ");
        sayi = input.nextInt();
        
        int bas1 = 0,bas2 = 1;
        
        System.out.print(bas1+" ");
        System.out.print(bas2+" ");
        
        
        for(int i = 1; i<=sayi;i++){
           
            toplam = bas1 + bas2;
            bas1 = bas2;
            bas2 = toplam;
            System.out.print(toplam+ " ");
        }
    }
    
}
