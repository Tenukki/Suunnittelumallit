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
public class Strategy2 implements ListConverter {
    private boolean bool = false;
    
    @Override
    public String listToString(List<String> list) {
        StringBuilder str = new StringBuilder();
        for (String item : list){
            str.append(item);
            if(bool) str.append("\n");
            bool = !bool;
        }        
        return str.toString();
    }    
}