/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility10;

/**
 *
 * @author Santeri
 */
public class Lahiesimies extends JohtajaPower{
    private final double ALLOWABLE = 1.02 * BASE;
    
    @Override
    public void processRequest(Palkka request) {
        if (request.getTpalkka() <= ALLOWABLE) {
        System.out.println(
        "Lähiesimies will approve $" + request.getTpalkka());
        } else if (successor != null) {
            successor.processRequest(request);
        }

    }
    
}
