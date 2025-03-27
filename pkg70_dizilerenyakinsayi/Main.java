
package pkg70_dizilerenyakinsayi;

import java.util.Arrays;


public class Main {
    
    
    
    
    public static void main(String[] args) {
       
        
        
        
        
        
        int[] Dizi = {15,12,788,1,-1,-778,2,0};
       
        
        
        
        int fark = Dizi[0];
        int kuYakin = Dizi[0], buYakin = Dizi[0];
        
        int girilenSayi = 5;
        
        
        
        Arrays.sort(Dizi);// siraladik
        System.out.println(Arrays.toString(Dizi));
        
        
        for(int i=0;i<Dizi.length;i++){
            if(girilenSayi>Dizi[i]){
                
               kuYakin =  Dizi[i];
               buYakin = Dizi[i+1];
                
            }
        }
        
  
        System.out.println("Girilen sayıdan küçük en yakın sayı :" + kuYakin);
        System.out.println("Girilen sayıdan büyük  en yakın sayı :" + buYakin);
        
        }
    }
    
//}
    

