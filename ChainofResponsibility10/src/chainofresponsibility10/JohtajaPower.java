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
abstract class JohtajaPower {

    protected static final double BASE = 2000;
    
    protected JohtajaPower successor;
    
    public void setSuccessor(JohtajaPower successor) {
        this.successor = successor;
    }
    abstract public void processRequest(Palkka request);
}
