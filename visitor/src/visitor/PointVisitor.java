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
public class PointVisitor implements HahmoVisitor{
    private int points;

    public PointVisitor() {
        points = 0;
    }
    
    
    public double getPoints() {
        return points;
    }
    
    @Override
    public void visit(Talonpoika talonpoika) {
        points = talonpoika.getPoints();
    }

    @Override
    public void visit(Ritari ritari) {
        points = ritari.getPoints();
    }

    @Override
    public void visit(Kuningas kuningas) {
        points = kuningas.getPoints();
    }
}
