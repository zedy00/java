
package pkg47_ikisayinin_ebob_ekoku;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        
        int sayi1,sayi2;
        
        int ebob,ekok;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Birinci sayıyı giriniz");
        sayi1 = input.nextInt();
        
        System.out.println("İkinci sayıyı giriniz");
        sayi2 = input.nextInt();
        
      ///ebob
        int i =1;
        if(sayi1>sayi2){
            while(sayi1>i){
                if(sayi1 % i ==0 && sayi2 % i == 0){
                    ebob = i;
                    System.out.println(ebob);
                }
                i++;
            }
        }else{
            while(sayi2>i){
                if(sayi1 % i ==0 && sayi2 % i == 0){
                    ebob = i;
                    System.out.println(ebob);
                }
                i++;
            }
        }
        System.out.println("----------");
        
        //ekok
        int j = 1;
        while(j<= (sayi1*sayi2)){
            if(j% sayi1 == 0 && j%sayi2 ==0){
                
                System.out.println(j);
                
                break;
            }
           j++;
        }
    }
    
}
