/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä7state;

/**
 *
 * @author Santeri
 */
public class Venusaur implements Pokemon{
    @Override
    public void isku() {
        System.out.println("RuohoPyssy wap wap wap");
    }

    @Override
    public String nimi() {
        return "Venusaur";
    }

    @Override
    public void statsit() {
        System.out.println("Healt: 150 Strike:120 Level:88");
    }
}
