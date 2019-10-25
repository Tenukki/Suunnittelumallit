/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä3composite;

/**
 *
 * @author Santeri
 */
public class Verkkokortti implements Laiteosa{
    private String nimi;
    private String tyyppi;
    private int hinta;

    public Verkkokortti(String nimi, String tyyppi, int hinta) {
        this.nimi = nimi;
        this.tyyppi = tyyppi;
        this.hinta = hinta;
    }

    @Override
    public int hinta() {
        return hinta;
    }

    @Override
    public void addHinta(Laiteosa osa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
