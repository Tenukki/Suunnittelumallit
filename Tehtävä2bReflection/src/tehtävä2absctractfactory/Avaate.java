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
public abstract class Avaate {
    private String tehdas;

    public Avaate() {
    }

    public Avaate(String tehdas) {
        this.tehdas = tehdas;
    }

    public void setTehdas(String tehdas) {
        this.tehdas = tehdas;
    }

    public String getTehdas() {
        return tehdas;
    }
    
    
}
