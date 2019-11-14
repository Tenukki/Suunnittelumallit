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
public class Kengät extends Avaate  implements Asu{
    private String nimi;

    public Kengät(String nimi, String tehdas) {
        super(tehdas);
        this.nimi = nimi;
    }


    @Override
    public String toString() {
        return nimi +" tehdas " + getTehdas();
    }
}
