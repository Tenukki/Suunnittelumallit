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
public interface HahmoVisitor {
    
    void visit(Talonpoika talonpoika);
    void visit(Ritari ritari);
    void visit(Kuningas kuningas);

    
}
