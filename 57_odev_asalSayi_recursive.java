
package pkg57_recursive_asalsayi;

import java.util.Scanner;


public class Main {
    
      
       
    public static int asalKontrol(int sayi, int i){
       
        if(i != 1){
            if(sayi % i != 0){
                
                return asalKontrol( sayi, i-1);
            }                        
            return 0;
        }
        return 1;  
      
    }  
                
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin :");
        int sayi = input.nextInt();
        int bolenSayi = asalKontrol(sayi, sayi/2);
        
        
        
        if(bolenSayi == 1){
             System.out.println(sayi +" = sayısı Asal sayıdır");
        }else{
            System.out.println(sayi + " = sayısı Asal değildir");
    }
    }
    
}
