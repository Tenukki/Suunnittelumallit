/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä4observer;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santeri
 */
public class DigitalClock implements Observer{
    
    private ClockTimer timer;

    public DigitalClock(ClockTimer timer) {
        this.timer = timer;
        timer.addObserver(this);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        if(timer == o){
            try {
                post();
            } catch (InterruptedException ex) {
                System.out.println("Virhe");
            }
        }
    }
    
    public void post() throws InterruptedException{
        System.out.println(timer.getTunti()+ ":" +timer.getMinutti()+":"+timer.getSekuntti());
    }
    
}
