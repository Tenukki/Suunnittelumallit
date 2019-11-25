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
public class Visitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controller c = new Controller();
        Talonpoika c1 = new Talonpoika();
        Ritari c2 = new Ritari();
        Kuningas c3 = new Kuningas();
     
        c.setHahmo(c1);
        getDetails(c);
        System.out.println("-----");
        
        c.setHahmo(c2);
        getDetails(c);
        System.out.println("------");
        
        c.setHahmo(c3);
        getDetails(c);
        
        PointVisitor visitor = new PointVisitor(); 
        
        c1.accept(visitor);
        double c1Points = visitor.getPoints();
        System.out.println(c1Points);
        
        c2.accept(visitor);
        double c2Points = visitor.getPoints();
        System.out.println(c2Points);
        
        c3.accept(visitor);
        c3.accept(visitor);
        c3.accept(visitor);
        double c3Points = visitor.getPoints();
        System.out.println(c3Points);
    }
    
     private static void getDetails(Controller c) {
        c.getNimi();
        c.getStats();
    }
    
}
