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
public class MC extends Builder{
    
    private StringBuilder burger;
    
    @Override
    public void newBurger() {
        burger = new StringBuilder();
    }

    @Override
    public StringBuilder getBurgeri() {
        return burger;
    }

    @Override
    public void buildLeipa() {
        burger.append("Pulla vähä väliin");
    }

    @Override
    public void buildPihvi() {
        burger.append("Koko liha pihvi");
    }
    
}
