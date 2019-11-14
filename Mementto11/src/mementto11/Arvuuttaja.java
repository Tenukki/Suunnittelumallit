/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementto11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Santeri
 */
public class Arvuuttaja {
    
   private Memento mento;

   public void add(Memento state){
      this.mento = state;
   }
   
   public boolean arvas(Pelaaja p,int arvays){
       if(arvays == p.getpState().getState()){
           return true;
       }else{
           return false;
       }
   }

   
   public Memento liityPeliin(Pelaaja p){
       Random rand = new Random();
       int luku = rand.nextInt(1);
       Originator a = new Originator();
       a.setState(luku);
       return a.saveStateToMemento();
   }
    
}
