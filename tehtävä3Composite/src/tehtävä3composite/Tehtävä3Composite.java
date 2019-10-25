/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä3composite;

/**
 *
 * @author Santeri
 */
public class Tehtävä3Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Laiteosa muisti = new Muisti("Muisti", 5, 120);
        Laiteosa prosessrori = new Prosessori("Prosessori", 223, 500);
        Laiteosa verkkokortti = new Verkkokortti("Verkkokortti", "w3cs", 30);
        
        System.out.println("Muisti hinta:" + muisti.hinta());
        System.out.println("Prosessori hinta: "  + prosessrori.hinta());
        System.out.println("Verkkokortti hinta: " + verkkokortti.hinta());
        
        Laiteosa kotelo = new Kotelo();
        kotelo.addHinta(muisti);
        kotelo.addHinta(prosessrori);
        kotelo.addHinta(verkkokortti);
       

        System.out.println("Kotelo hinta " + kotelo.hinta());
    }
    
}
