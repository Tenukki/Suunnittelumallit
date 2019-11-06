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
public class Bulbasaur implements Pokemon{

    @Override
    public void isku() {
        System.out.println("Ruohosivallus WIPH WIPH");
    }

    @Override
    public String nimi() {
        return "Bulbasaur";
    }

    @Override
    public void statsit() {
        System.out.println("Healt: 100 Strike:82 Level:40");
    }
    
}
