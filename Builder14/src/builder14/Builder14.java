/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder14;

/**
 *
 * @author Santeri
 */
public class Builder14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tarjoilija tarjoilija = new Tarjoilija();
        
        Builder h = new Hesburger();
        tarjoilija.setBurgerBuilder(h);
        tarjoilija.LuoBurgeri();
        
        Object aa = tarjoilija.getBurger();
        System.out.println(aa);
        
        
        
        Builder aaaa = new MC();
        tarjoilija.setBurgerBuilder(aaaa);
        tarjoilija.LuoBurgeri();
        Object aaa = tarjoilija.getBurger();
        System.out.println(aaa);
        
        
    }
    
}
