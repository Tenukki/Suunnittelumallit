/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy9tehtava;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Santeri
 */
public class Strategy1 implements ListConverter {    
    
    @Override
    public String listToString(List<String> list) {
        StringBuilder str = new StringBuilder();   
        Iterator iterator = list.iterator(); 
        while (iterator.hasNext()){
            str.append(iterator.next()).append("\n");
        }        
        return str.toString();
    }    
}
