/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persone;

/**
 *
 * @author Amatucci Simone 4INB 18/1/2016
 */
public class Persone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1, p2;
        int a;
        p1= new Persona("Sono Mario");
        p2= new Persona("Sono Anna");
        p1.come_ti_chiami();
        p1.saluta();
        p2.come_ti_chiami();
        p2.saluta();
    }
    
}
