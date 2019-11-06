/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä6decorator;

/**
 *
 * @author Santeri
 */
public class Tehtävä6Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pizza a = new Juusto(new Paprika(new Sipuli(new Pohja())));
        Pizza b = new Paprika(new Sipuli(new Tonnikala(new Pohja())));
        Pizza c = new Tonnikala(new Sieni(new Juusto(new Pohja())));
        
        System.out.println(a.tuoteKuvaus());
        System.out.println(b.tuoteKuvaus());
        System.out.println(c.tuoteKuvaus());
    }
    
}
