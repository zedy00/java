
package pkg52_ornek_fibbonacci;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        int sayi;
        int bolenSayi = 0;
        
        
        System.out.println("1 den 100 e kadar asal sayıları yazdıran program");
        
     
        
        for(int i = 2;i<100;i++){
            for(int j = 1; j<50; j++)
            if(i % j == 0){
                bolenSayi = bolenSayi + 1 ;
                
                
            }
            
            if(bolenSayi >2){
               // System.out.println("Bu sayı asal değildir = "+ i);
            }else{
                 System.out.print(" "+ i +" ");
            }
            
            bolenSayi = 0;
        }
    }
    
}

