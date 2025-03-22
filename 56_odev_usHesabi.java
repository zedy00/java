package pkg56_recursiveushesaplama;

import java.util.Scanner;


public class Main {
    
    public static int usHesaplama(int taban, int us){
        if(us == 0){
            return 1;
        }
       
        return taban *usHesaplama(taban,us-1);
    }
    
    

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değerini giriniz");
        int taban = input.nextInt();
        
        System.out.println("Üs değerini giriniz");
        int us = input.nextInt();
      
        int sonuc = usHesaplama(taban,us);
        System.out.println("Tabanı :"+ taban + " üssü :"+ us +" sonuc = "+ sonuc);
    }
    
}
