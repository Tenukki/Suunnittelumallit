/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author Santeri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Screen s = new Screen();
        Button down = new Button(new Down(s));
        Button up = new Button(new Up(s));
        
        up.click();
        System.out.println(s);
        down.click();
        System.out.println(s);
        up.click();
        System.out.println(s);
        
        
    }
    
}
