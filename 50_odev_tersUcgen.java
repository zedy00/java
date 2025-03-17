package pkg50_odev_tersucgen;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       
        int basaSayi;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayisini giriniz :");
        
        basaSayi = input.nextInt();
        
        for(int i =basaSayi ;0<i ; i--){
            
            
           for(int j =((2*i)-1);j>0;j--){
               System.out.print("*");
           }
          
            System.out.println();
        }

        
    }
    
}
