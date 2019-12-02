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
public class Button {
    Command command;
    
    public Button(Command command){
        this.command = command;
    }
    
    public void click(){
        command.execute();
    }
}
