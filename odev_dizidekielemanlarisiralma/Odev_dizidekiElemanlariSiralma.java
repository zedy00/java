
package odev_dizidekielemanlarisiralma;

import java.util.Arrays;
import java.util.Scanner;


public class Odev_dizidekiElemanlariSiralma {
        
       
    
    public static void main(String[] args) {
        
       
        
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Dizinin boyutunu giriniz :");
        int boyut = input.nextInt();
        
        int[] Dizi = new int[boyut]; 
        
        for(int i = 0;i<Dizi.length;i++){
             System.out.print((i+1)+" .elemanı giriniz :");
             int n = input.nextInt();
             Dizi[i] = n;
        }
        
        Arrays.sort(Dizi);
        System.out.println(Arrays.toString(Dizi));
        
        
      
        
    }
    
}
