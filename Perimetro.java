/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimetro;

import java.util.Scanner;

/**
 *
 * @author Amatucci Simone 4INB 5/1/2017
 */
public class Perimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float base;
        float altezza;
        do{
         System.out.println("Inserire base: ");
         base = input.nextFloat();
        }while(base <= 0);
        do{
         System.out.println("Inserire altezza: ");
         altezza = input.nextFloat();
        }while((altezza <= 0)||(altezza == base)); 
        float perimetro = (base * 2) + (altezza * 2);
        float area = base * altezza;
        System.out.println("Il perimetro vale: " + perimetro);
        System.out.println("L' area vale: " + area);
    }
    
}
