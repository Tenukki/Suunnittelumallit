/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementto11;

/**
 *
 * @author Santeri
 */
public class Pelaaja {
    private String nimi;
    private Memento pState;

    public Pelaaja(String nimi) {
        this.nimi = nimi;
    }

    public Memento getpState() {
        return pState;
    }

    public void setpState(Memento pState) {
        this.pState = pState;
    }

    public String getNimi() {
        return nimi;
    }
    
    

    @Override
    public String toString() {
       return "pelaajan nimi " +nimi;
    }
    
    
}
