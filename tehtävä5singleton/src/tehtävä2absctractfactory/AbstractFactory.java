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
public class AbstractFactory {
    
    private static AbstractFactory INSTANCE = null;

    private AbstractFactory() {
        Tehdas a = new Tehdas("Adidas");
        System.out.println(a.luoFarmari());
        System.out.println(a.luoKengat());
        System.out.println(a.luoLippis());
        System.out.println(a.luoPaita());
    }
    
    public static AbstractFactory getInstance(){
        if(INSTANCE == null){
            INSTANCE = new AbstractFactory();
        }
        return INSTANCE;
    }
    
    
    
}
