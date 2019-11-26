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
public class Madapter implements Player{
    
    CustomPlayer customPlayer;

    public Madapter(String type) {
        if(type.equals("mp3")){
            customPlayer = new Mp3Player();
        }else if(type.equals("mp4")){
            customPlayer = new Mp4Player();
        }
    }
    
    
    
    @Override
    public void play(String type, String name) {
        if(type.equals("mp3")){
            customPlayer.playMp3(name);
        }else if(type.equals("mp4")){
            customPlayer.playMp4(name);
        }
    }
    
}
