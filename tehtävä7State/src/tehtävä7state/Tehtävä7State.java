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
public class Tehtävä7State {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controller con = new Controller();
        
        con.setIvysaur();
        if(con.nimi().equals("Bulbasaur")){
            System.out.println(con.nimi());
            con.hyökkaa();
            con.statsit();
        }
        
        if(con.nimi().equals("Ivysaur")){
            System.out.println(con.nimi());
            con.hyökkaa();
            con.statsit();
        }
        con.setVenusaur();
        if(con.nimi().equals("Venusaur")){
            System.out.println(con.nimi());
            con.hyökkaa();
            con.statsit();
        }
    }
    
}
