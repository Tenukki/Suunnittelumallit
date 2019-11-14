/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility10;

/**
 *
 * @author Santeri
 */
public class Palkka {
    private double Tpalkka;

    public Palkka(double Tpalkka) {
        this.Tpalkka = Tpalkka;
    }

    public double getTpalkka() {
        return Tpalkka;
    }

    public void setTpalkka(double Tpalkka) {
        this.Tpalkka = Tpalkka;
    }

    @Override
    public String toString() {
        return "Palkka : "+Tpalkka;
    }
    
    
}
