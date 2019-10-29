/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä4observer;

/**
 *
 * @author Santeri
 */
public class Tehtävä4Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        ClockTimer c = new ClockTimer();
        DigitalClock a = new DigitalClock(c);
        while (true) {            
            c.tick();
        }
    }
    
}
