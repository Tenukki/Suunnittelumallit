/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author Santeri
 */
public class Rehtori extends AterioivaOtus{
    
    @Override
    public Juoma createJuoma() {
        return new Sima();
    }
    
}
