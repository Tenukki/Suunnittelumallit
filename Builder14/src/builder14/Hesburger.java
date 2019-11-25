/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder14;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santeri
 */
public class Hesburger extends Builder{

     private List<String> burger;
     
    @Override
    public void newBurger() {
        this.burger = new ArrayList();
        this.burger.add("Hese");
    }

    @Override
    public List getBurgeri() {
        return burger;
    }

    @Override
    public void buildLeipa() {
        burger.add("lisäää leipä");
    }

    @Override
    public void buildPihvi() {
        burger.add("pihvi");
    }
     
}
