/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Santeri
 */
public class Mp4Player implements CustomPlayer{

    @Override
    public void playMp3(String file) {
        System.out.println("File type not supported");
    }

    @Override
    public void playMp4(String file) {
        System.out.println("Now playing song " + file);
    }
    
}
