/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder14;

/**
 *
 * @author Santeri
 */
public class Tarjoilija {
    private Builder builder;

    public void setBurgerBuilder(Builder b) {
         builder = b;
    }
    
    public Object getBurger() {
        return builder.getBurgeri();
    }
    
    public void LuoBurgeri() {
        builder.newBurger();
        builder.buildPihvi();
        builder.buildLeipa();
    }
}
