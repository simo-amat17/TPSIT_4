
package finchelabarcava;

/**
 *
 * @author Amatucci Simone 4INB 6/04/2017
 */
public class Finchelabarcava {
   public double x;
   public double y;

    public Finchelabarcava(double x, double y) {
        this.x = 5;
        this.y = 120;
    }
   public double getX(){
       return x;
   }
   public double getY(){
       return y;
   }
    public static void main(String[] args) {
        Finestra f;
        int p1=0, p2=0;
        f= new Finestra();
        f.setVisible(true);
        f.setLocation(p1=20,p2=200);
        f.setTitle("Fin che la barca và..");
    }
    
    
}
