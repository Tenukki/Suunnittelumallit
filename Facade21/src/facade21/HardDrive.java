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
public class HardDrive {
    public byte[] read(long lba, int size) { 
        System.out.println("lba " + lba);
        System.out.println("Size on file " +size);
        return new byte[size];
        
    }
}
