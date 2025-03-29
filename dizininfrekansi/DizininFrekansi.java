
package dizininfrekansi;

public class DizininFrekansi {

   
    public static void main(String[] args) {
       
        int Dizi[]= {10,20,20,10,10,20,5,20};
        
        int tekrarEtme = 0;
        
        boolean tekrarEttimi[] = new boolean[Dizi.length];        
        
        
        for(int i = 0; i<Dizi.length;i++){
            
            if( tekrarEttimi[i]){
                continue;
            }
            
            for(int j = 0; j<Dizi.length;j++){
                if(Dizi[i] == Dizi[j]){
                    tekrarEtme = tekrarEtme + 1;
                    tekrarEttimi[j]  = true;
                    
                }
                
            }        
            System.out.println(Dizi[i]+ " sayısı "+ tekrarEtme +" kere eder ");
            tekrarEtme = 0;
        }
    }
    
}
