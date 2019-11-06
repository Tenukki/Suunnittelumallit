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
public abstract class Ainesosa implements Pizza{
    protected Pizza pizza;

    public Ainesosa(Pizza pizza) {
        this.pizza = pizza;
    }
    
    
}
