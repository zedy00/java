package pkg45_ornek_elmas_yapma;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz");
        int n = input.nextInt();
        
        
        
        for(int i=1 ; i<=n; i++){
            for(int j = 1 ; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=((2*i)-1); k++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        for(int i = n-1; 0<i; i--){
            
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
                  
            }
            for(int k = 1; k<= ((i*2)-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
