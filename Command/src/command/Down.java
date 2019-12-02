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
public class Down implements Command{
    private Screen screen;
    
    public Down(Screen screen){
        this.screen = screen;
    }
    
    @Override
    public void execute() {
        screen.setDown();
    }
}