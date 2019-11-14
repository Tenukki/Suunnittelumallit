/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy9tehtava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santeri
 */
public class Strategy9tehtava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListConvertUser a = new ListConvertUser(new Strategy1());        
        List<String> lista = new ArrayList<>();        
        for (int i = 0 ; i <= 10; i++) lista.add("testi" + i);
        
        a.tulostaLista(lista);
        System.out.println("-----------------------------");
        a.setStrategy(new Strategy2());
        a.tulostaLista(lista);
        System.out.println("-----------------------------");
        a.setStrategy(new Strategy3());
        a.tulostaLista(lista);
    }    
}
