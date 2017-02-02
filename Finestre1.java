/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finestre1;

import java.util.Scanner;

/**
 *
 * @author Amatucci Simone 4INB 2/2/2017
 */
public class Finestre1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Finestra f;
        int p1= 10, p2= 20;
        int n,x;
        do {
            System.out.println("Numero finestre da visualizzare:");
            n = input.nextInt();
        } while ((n <= 0)||(n>10));
        for(x=0;x<n;x++){
          f=new Finestra();
        f.setVisible(true);
        f.testo.setText("Sono la finestra "+ (x+1));
        f.setLocation(p1=p1+20,p2=p2+50);
        f.setTitle("Finestra"+ (x+1));
        }
    }
    
}
