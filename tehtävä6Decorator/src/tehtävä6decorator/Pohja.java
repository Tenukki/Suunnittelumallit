/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä6decorator;

/**
 *
 * @author Santeri
 */
public class Pohja implements Pizza{

    @Override
    public int hinta() {
        return 5;
    }

    @Override
    public String tuoteKuvaus() {
        return " Pizza pohjan";
    }
    
    
    
}
