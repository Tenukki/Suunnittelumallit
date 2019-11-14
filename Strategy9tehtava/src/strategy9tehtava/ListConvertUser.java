/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy9tehtava;

import java.util.List;

/**
 *
 * @author Santeri
 */
public class ListConvertUser {
    private ListConverter strategy;
    
    public ListConvertUser(ListConverter strategy){
        this.strategy = strategy;
    }
    
    public void setStrategy(ListConverter strategy){
        this.strategy = strategy;
    }
    
    public void tulostaLista(List<String> list) {
        System.out.println(strategy.listToString(list));
    }
}