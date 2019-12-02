/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade21;

/**
 *
 * @author Santeri
 */
class CPU {
    public void freeze() { 
        System.out.println("Computer Freezed");
    }
    public void jump(long position) {
        System.out.println("Changin exucutable programm");
    }
    public void execute() {
        System.out.println("Execute");
    }
}
