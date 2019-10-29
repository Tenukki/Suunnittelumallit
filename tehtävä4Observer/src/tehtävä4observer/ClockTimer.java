/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä4observer;

import java.time.Clock;
import java.util.Calendar;
import java.util.Date;
import java.util.Observable;

/**
 *
 * @author Santeri
 */
public class ClockTimer extends Observable{
    private Date date;
    
    private int tunti;
    private int minutti;
    private int sekuntti;

    public ClockTimer() {
        this.date = new Date();
        this.tunti = date.getHours();
        this.minutti = date.getMinutes();
        this.sekuntti = date.getSeconds();
    }
    
    public void tick() throws InterruptedException{
        Date uusi = new Date();
        Thread.sleep(1000);
        this.tunti = uusi.getHours();
        this.minutti = uusi.getMinutes();
        this.sekuntti = uusi.getSeconds();
        
        setChanged();
        notifyObservers();
    }

    public int getTunti() {
        return tunti;
    }

    public void setTunti(int tunti) {
        this.tunti = tunti;
    }

    public int getMinutti() {
        return minutti;
    }

    public void setMinutti(int minutti) {
        this.minutti = minutti;
    }

    public int getSekuntti() {
        return sekuntti;
    }

    public void setSekuntti(int sekuntti) {
        this.sekuntti = sekuntti;
    }

    
    
    

   
   
    
    
    
    

    
    
    
}
