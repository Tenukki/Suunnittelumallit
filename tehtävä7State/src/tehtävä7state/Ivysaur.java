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
public class Ivysaur implements Pokemon{
     @Override
    public void isku() {
        System.out.println("RuohoMyrsky WUUUUH");
    }

    @Override
    public String nimi() {
        return "Ivysaur";
    }

    @Override
    public void statsit() {
        System.out.println("Healt: 160 Strike:100 Level:60");
    }
}
