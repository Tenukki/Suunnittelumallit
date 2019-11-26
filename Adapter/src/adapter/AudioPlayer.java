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
public class AudioPlayer implements Player{
    
    Madapter madapter;
    
    @Override
    public void play(String filetype, String name) {
        if(filetype.equalsIgnoreCase("wow")){
            System.out.println("Default player is wow format" + name);
        }else if(filetype.equalsIgnoreCase("mp3")){
            madapter = new Madapter(filetype);
            madapter.play(filetype, name);
        }else if(filetype.equalsIgnoreCase("mp4")){
            madapter = new Madapter(filetype);
            madapter.play(filetype, name);
        }else{
            System.out.println("Not supported invalid");
        }
    }
    
}
