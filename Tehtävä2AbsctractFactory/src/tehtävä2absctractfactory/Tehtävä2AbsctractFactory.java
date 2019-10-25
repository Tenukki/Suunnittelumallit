/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä2absctractfactory;

/**
 *
 * @author Santeri
 */
public class Tehtävä2AbsctractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tehdas a = new Tehdas("Adidas");
        System.out.println("ADIDAS");
        System.out.println(a.luoFarmari());
        System.out.println(a.luoPaita());
        System.out.println(a.luoKengat());
        System.out.println(a.luoLippis());
        
        System.out.println();
        System.out.println("Boss");
        a = new Tehdas("boss");
        System.out.println(a.luoFarmari());
        System.out.println(a.luoPaita());
        System.out.println(a.luoKengat());
        System.out.println(a.luoLippis());
    }
    
}
