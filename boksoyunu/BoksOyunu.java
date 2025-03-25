
package boksoyunu;


public class BoksOyunu {

    
    public static void main(String[] args) {
        
        Fighter marc = new Fighter("Marc", 15 ,100, 90, 0,0);
        Fighter alex = new Fighter("Alex", 10, 95, 95, 0,50);
        
        Ring r = new Ring(marc,alex, 85 ,100);// min max
        r.run();
        
    }
    
}
