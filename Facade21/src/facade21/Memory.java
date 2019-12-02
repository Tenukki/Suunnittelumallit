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
public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Loading file from postion " + position + " and data lenght " + data.length);
    }
}
