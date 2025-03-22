
package pkg55_odev_gelismis_hesapmakinesi;

import java.util.Scanner;


public class Main {
    
    public static void toplama(){
        Scanner input = new Scanner(System.in);
        int sayi, sonuc =0, i =1;
        while(true){
            System.out.print(i++ +". sayı :");
            sayi = input.nextInt();
            if(sayi == 0){
                break;
            }else{
                sonuc = sonuc + sayi;
            }
            
        }
        System.out.println("Sonuc : "+ sonuc);
    }
    
    public static void cikarma(){
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayi gireceksiniz");
        int counter = input.nextInt();
        int number, result = 0;
        
        for(int i =1;i<= counter;i++){
            System.out.print(i+". sayı:");
            number = input.nextInt();
            if(i==1){
                result = result + number;
                continue;
            }
            result = result - number;
        }
        System.out.println("Sonuc : "+ result);
    }
    
    public static void carpma(){
        Scanner input = new Scanner(System.in);
        int number, result = 1, i = 1;
        
        while(true){
            System.out.println(i++ + ".sayı :");
            
            number = input.nextInt();
            
            if(number == 1){
                break;
            }
            if(number == 0){
                result = 0;
                break;
            }
            result = result * number;
        }
        
        System.out.println("Sonuç :" + result);
    }
    
    public static void bolme(){
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz");
        int counter = input.nextInt();
        double number, result = 0.0;
        
        for(int i= 1; i<= counter; i++){
            System.out.println(i + ".sayı :");
            number = input.nextDouble();
            if(i !=1 && number == 0){
                System.out.println("Böleni 0 giremezsiniz");
                continue;
            }
            if(i == 1){
                result = number;
                continue;
            }
            result = result / number;
        }
         System.out.println("Sonuc : "+ result);
    }
    
     public static void usAlma(){
        Scanner input = new Scanner(System.in);
        System.out.println("Taban degerin girin");
        int base = input.nextInt();
        System.out.println("Üs degerini girin");
        int exponent = input.nextInt();
        int result = 1;
        
        for(int i= 1; i<= exponent; i++){
          result = result*base;
        }
        System.out.println("Sonuç : "+ result);
        
    }
     
      public static void factorial(){
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı girin");
        int n = input.nextInt();
        
        int result = 1;
        
        for(int i= 1; i<= n; i++){
          result = result*i;
        }
        System.out.println("Sonuç : "+ result);
        
    }
       public static void modAlma(){
        Scanner input = new Scanner(System.in);
        System.out.println("1.Sayıyı girin");
        int n1 = input.nextInt();
        
        System.out.println("2.Sayıyı girin");
        int n2 = input.nextInt();
        int result = 1;
        
        if(n2>n1){
               System.out.println("Küçük sayının modu alınmaz");
        }else{
            result = n1 % n2;
             System.out.println("Sonuç : "+ result);
        }
       
        
    }
       public static void dikDortgenkAlanCevre(){
        Scanner input = new Scanner(System.in);
        System.out.println("1.kenarı girin");
        int n1 = input.nextInt();
        
        System.out.println("2.kenarı girin");
        int n2 = input.nextInt();
        int alan = 1,cevre = 1;
        
        
        if(n2<=0 || n1<=0){
               System.out.println("kenar 0 veya negatif sayı olamaz");
        }else{
            alan = n1 * n2;
            cevre = 2*(n1 + n2);
             System.out.println("Alan : "+ alan + "\nÇevre :"+ cevre);
        }
       
        
    }
    

    
    public static void main(String[] args) {
       int secme; 
       Scanner input = new Scanner(System.in);
       
       
       
       String islem = "--------------------\n"
                     +"1-Toplama İşlemi\n"
                     +"2-Çıkarma işlemi\n"
                     +"3-Çarpma işlemi\n"
                     +"4-Bölme işlemi\n"
                     +"5-Üslü sayı hesaplama\n"
                     +"6-faktariye hesaplama\n"
                     +"7-Mod alma\n"
                     +"8-Dikdörtgen alan ve Çevre hesabı\n"
                     +"0-Çıkış Yap";
       
       do{
           System.out.println(islem);
           System.out.print("Yapmak istegiğiniz işlemi seçin :");
           secme = input.nextInt();
           switch(secme){
               case 1:
                   toplama();
                   break;
               case 2:
                   cikarma();
                   break;
               case 3:
                   carpma();
                   break;
               case 4:
                   bolme();
                   break;
               case 5 :
                   usAlma();
                   break;
               case 6:
                   factorial();
                   break;
               case 7:
                   modAlma();
                   break;
               case 8:
                   dikDortgenkAlanCevre();
                   break;
               case 0:
                   break;
                    
                   
               default:
                   System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz");
           
           
       }
       } while(secme !=0);
               
           
       }
 
       
       
    }
 
    

