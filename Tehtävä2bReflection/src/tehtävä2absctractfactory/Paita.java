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
public class Paita extends Avaate implements Asu{
    private String nimi;
    private String koko;

    public Paita(String nimi, String koko, String tehdas) {
        super(tehdas);
        this.nimi = nimi;
        this.koko = koko;
    }

    @Override
    public String toString() {
        return nimi + " koko: "+ koko + " tehdas "+ getTehdas();
    }
    
    
    
    
    
}
