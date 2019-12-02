/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Santeri
 */
public class Iter {

  
    public static void main(String[] args) throws InterruptedException {
        //iterointi onnistuu kun on 2 säiettä ja 2 iteraattoria
        Multiple();
        Thread.sleep(1000);
        
        //iterointi ei onnistunut vain toinen säe käynnistyi
        waitter();
        Thread.sleep(1000);
        
        //kun alkuperäistä listaa jota iteroidaan yritetään muokata, tuottaa ohjelma virheen java.util.ConcurrentModificationException
        Modify();
        Thread.sleep(1000);
        
        //remove iterointi poistaa elementin iteroinnista
        poista();
    }
    
    //a
    public static void Multiple(){
        List<String> lista = new ArrayList<>();
        
        lista.add("a");
        lista.add("b");
        lista.add("c");
        
        Iterator<String> eka = lista.iterator();
        Iterator<String> toka = lista.iterator();
        
        new Thread(() -> {
            String sana = "";
            while(eka.hasNext()){
                sana += eka.next();
            }
            
            System.out.println("Onnistuiko lista eka? " + eka.equals("abc"));
        }).start();

        new Thread(() -> {
            String sana = "";
            while(toka.hasNext()){
                sana += toka.next();
            }
            
            System.out.println("Onnistuiko lista toka? " + eka.equals("abc"));
        }).start();
    }
    
    //b
    public static void waitter(){
        List<String> lista = new ArrayList<>();
        
        lista.add("a");
        lista.add("b");
        lista.add("c");
        
        Iterator<String> eka = lista.iterator();
        
        new Thread(() -> {
            String sana = "";
            while(eka.hasNext()){
                sana += eka.next();
                System.out.println(" Thread 1 "+ sana);
            }
            System.out.println(sana);
            System.out.println("Onnistuiko lista eka? " + eka.equals("abc"));
        }).start();
        
        new Thread(() -> {
            String sana = "";
            while(eka.hasNext()){
                
                sana += eka.next();
                System.out.println( "Thread 2 " + sana);
            }
            
            System.out.println("Onnistuiko lista eka? " + eka.equals("abc"));
        }).start();
    }
    
    //c
    public static void Modify(){
        List<String> lista = new ArrayList<>();
        
        lista.add("a");
        lista.add("b");
        lista.add("c");
        
        Iterator<String> eka = lista.iterator();
        
        String sana = "";
        
        try {
            while(eka.hasNext()){
                sana += eka.next();
                lista.add("F");
                System.out.println(" Modify "+ sana);
             }
        } catch (Exception e) {
            System.out.println(e);
        }
          
        
    }

    //d
    public static void poista(){
        List<String> lista = new ArrayList<>();
        
        lista.add("a");
        lista.add("b");
        lista.add("c");
        
        Iterator<String> eka = lista.iterator();
        
        String sana = "";
        
        try {
            while(eka.hasNext()){
                System.out.println(eka.next());
                eka.remove();
                System.out.println(eka.next());
             }
        } catch (Exception e) {
            System.out.println(e);
        }
    }  
    
}
