
package pkg69_dizininelemanlarinin_ortalamasi;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double harmonikOrt = 0;
        
        double[] Dizi = {1,2,3,4,5};
        
        for(int i = 0;i<Dizi.length;i++){
            
            harmonikOrt = harmonikOrt + (1/Dizi[i]);
            
            System.out.println("1"+"/"+Dizi[i]+"+");
            
        }
        System.out.println("Bu sayıların harmonik ortalaması :" + harmonikOrt);
    }
    
}
