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
public class Controller {
    public static Bulbasaur bulbasaur;
    public static Ivysaur ivysaur;
    public static Venusaur venusaur;

    private static Pokemon pok;
    
    public Controller() {
        bulbasaur = new Bulbasaur();
        ivysaur = new Ivysaur();
        venusaur = new Venusaur();
    }
    
    public void setBulbasaur(){
        pok = bulbasaur;
    }
    
    public void setIvysaur(){
        pok = (Pokemon) ivysaur;
    }
    
    public void setVenusaur(){
        pok = venusaur;
    }
    
    public void hyökkaa(){
        pok.isku();
    }
    
    public String nimi(){
        return pok.nimi();
    }
    
    public void statsit(){
        pok.statsit();
    }
    
    
}
