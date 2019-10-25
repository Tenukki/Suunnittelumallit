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
public class Farmari extends Avaate implements Asu{
    private String nimi;
    
    public Farmari() {
    }

    public Farmari(String nimi, String tehdas) {
        super(tehdas);
        this.nimi = nimi;
    }

    @Override
    public String toString() {
        return nimi + " " + getTehdas();
    }
    
    
    
    
}
