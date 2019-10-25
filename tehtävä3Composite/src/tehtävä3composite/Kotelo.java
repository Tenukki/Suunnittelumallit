/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä3composite;

import java.util.ArrayList;

/**
 *
 * @author Santeri
 */
public class Kotelo implements Laiteosa{

    private ArrayList<Laiteosa> osat = new ArrayList<>();
    private String kotelo = "Kotelo";
    private int hinta;

    public Kotelo() {
    }
    
    @Override
    public int hinta() {
        this.hinta = osat.stream().mapToInt(a -> a.hinta()).sum();
        return hinta;
    }

    @Override
    public void addHinta(Laiteosa osa) {
        osat.add(osa);
    }
    
}
