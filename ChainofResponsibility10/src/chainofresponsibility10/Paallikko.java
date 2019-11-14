/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility10;

import static chainofresponsibility10.JohtajaPower.BASE;

/**
 *
 * @author Santeri
 */
public class Paallikko extends JohtajaPower{
    private final double ALLOWABLE = 1.02 * BASE;
    private final double ALLOWABLE2 = 1.05 * BASE;
    
    @Override
    public void processRequest(Palkka request) {
        if (request.getTpalkka() > ALLOWABLE && request.getTpalkka() < ALLOWABLE2 ) {
        System.out.println(
        "Päällikko will approve $" + request.getTpalkka());
        } else if (successor != null) {
            successor.processRequest(request);
        }

    }
}
