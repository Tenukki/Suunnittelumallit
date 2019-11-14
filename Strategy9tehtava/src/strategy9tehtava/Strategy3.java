package strategy9tehtava;


import java.util.List;
import strategy9tehtava.ListConverter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santeri
 */
public class Strategy3 implements ListConverter {    
    
    @Override
    public String listToString(List<String> list) {
        StringBuilder str = new StringBuilder();        
        for (int i = 0; i< list.size(); i++){
            str.append(list.get(i));
            if(i%3 == 2) str.append("\n");
        }
        return str.toString();
    }
    
}