
package pkg49_mukemmeksayi;

import java.util.Scanner;


public class Main {

 
    public static void main(String[] args) {
        
        int sayi;
        int bolToplam = 0;
        
        Scanner input = new Scanner(System.in);
        
        while(1>0){
            System.out.println("Bir sayı giriniz");
            sayi = input.nextInt();
            for(int i = 1; i<(sayi-1);i++)
                if(sayi % i == 0){
                   int bolen = i;
                    //System.out.println(i);
                   bolToplam = bolToplam +bolen; 
                    System.out.println(bolToplam);
                   
                }
                if(bolToplam  == sayi){
                    System.out.println("Bu sayı mükemeldir");
                }else{
                    System.out.println("Bu sayı mükemel değildir");
                }
                
                bolToplam = 0;
        }
        
    }
    
}
