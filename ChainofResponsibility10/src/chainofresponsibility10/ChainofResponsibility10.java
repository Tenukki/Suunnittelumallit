/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Santeri
 */
public class ChainofResponsibility10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lahiesimies lahi = new Lahiesimies();
        Paallikko pal = new Paallikko();
        CEO ceo = new CEO();
        
        lahi.setSuccessor(pal);
        pal.setSuccessor(ceo);
        
        
        // Press Ctrl+C to end.
        try {
            while (true) {
            System.out.println("Enter the amount to check who should approve your expenditure.");
            System.out.print(">");
            double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
            lahi.processRequest(new Palkka(d));
            }
        } catch(Exception e) {
        System.exit(1);
        }

        // TODO code application logic here
    }
    
}
