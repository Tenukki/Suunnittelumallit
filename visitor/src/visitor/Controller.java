/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author Santeri
 */
public class Controller {
     private Hahmo hahmo;

    public Controller() {
        hahmo = null;
    }
    
    public void setHahmo(Hahmo h) {
        hahmo = h;
    }
    
    public void getNimi(){
        System.out.println(hahmo.getName());
    }
    
    public void punch(){
        
        hahmo.punch();
    }
    
    public void getStats(){
        System.out.println( hahmo.getPoints());
    }
    
    public void accept(HahmoVisitor visitor) {
        hahmo.accept(visitor);
    }
    
}
