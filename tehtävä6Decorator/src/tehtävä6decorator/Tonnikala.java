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
public class Tonnikala extends Ainesosa{

    public Tonnikala(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int hinta() {
        return pizza.hinta() + 3;
    }

    @Override
    public String tuoteKuvaus() {
        return pizza.tuoteKuvaus() + " Tonnikala ";
    }
    
}
