/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author Santeri
 */
public class Talonpoika implements Hahmo{

    int poinst = 0;
    
    @Override
    public String getName() {
        return "Talonpoika";
    }

    @Override
    public void punch() {
        System.out.println("Teen heinäää");
    }

    @Override
    public int getPoints() {
        return poinst;
    }

    @Override
    public void accept(HahmoVisitor visitor) {
        this.poinst += 4;
        visitor.visit(this);
    }
    
}
