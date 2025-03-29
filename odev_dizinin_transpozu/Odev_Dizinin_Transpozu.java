
package odev_dizinin_transpozu;


public class Odev_Dizinin_Transpozu {

    public static void main(String[] args) {
        
        int i = 2 , j  =3;
        int [][]matrix ={
            {1, 2 ,3},
            {4, 5, 6},
        };
        
       int transpoze[][] = new int[j][i];
        
        
        System.out.println("Matris:");
        for(int row = 0; row<matrix.length;row++){
            for(int column = 0; column<matrix[row].length;column++ ){
                System.out.print(matrix[row][column]+" ");
                transpoze[column][row] = matrix[row][column];
            }
            System.out.println();
                    
        }
        
        
       System.out.println("Transpoz :");
       for(int row =0;row<transpoze.length;row++){
           for(int column = 0; column<transpoze[row].length;column++){
               System.out.print(transpoze[row][column]+ " ");
           }
           System.out.println();
       }
    }
    
}
