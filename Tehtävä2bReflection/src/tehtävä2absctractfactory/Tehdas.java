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
public class Tehdas extends Atehdas{
    
    private String tehtaanNimi;

    public Tehdas(String tehtaanNimi) {
        this.tehtaanNimi = tehtaanNimi;
    }
    
    
    
    public Asu luoFarmari() {
        return new Farmari("Farmari", tehtaanNimi);
    }

    @Override
    public Asu luoPaita() {
        return new Paita("Paita", "xs", tehtaanNimi);
    }

    @Override
    public Asu luoKengat() {
        return new Kengät("Kengät", tehtaanNimi);
    }

    @Override
    public Asu luoLippis() {
        return new Lippis("lippis", tehtaanNimi);
    }
    
}
