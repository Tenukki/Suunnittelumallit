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
public class Screen {
    private boolean up = false;
    
    public void setUp(){
        this.up = true;
    }
    
    public void setDown(){
        this.up = false;
    }
    
    @Override 
    public String toString(){
        if(up){
            return "Screen is up";
        }else{
            return "Screen is down";
        }
    }
}
