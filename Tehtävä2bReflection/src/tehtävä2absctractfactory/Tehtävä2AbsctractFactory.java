/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä2absctractfactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 *
 * @author Santeri
 */
public class Tehtävä2AbsctractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Tehdas a = new Tehdas("Adidas");
        
        Class luokka = a.getClass();
        System.out.println("Luokan nimi " + luokka.getName());
        
//        Constructor con = luokka.getConstructor();
  //      System.out.println("Construction nimi " + con.getName());
        
         Method[] methods = luokka.getMethods(); 
         
         for (int x =1 ; x < 5;x++) {
             System.out.println(method.getName());
            Method methodcall2 = luokka.getDeclaredMethod("luoFarmari");
            methodcall2.invoke(a); 
        }
         
         
        
        /*
        System.out.println("ADIDAS");
        System.out.println(a.luoFarmari());
        System.out.println(a.luoPaita());
        System.out.println(a.luoKengat());
        System.out.println(a.luoLippis());
        */
        
        System.out.println();
        System.out.println("Boss");
        a = new Tehdas("boss");
        System.out.println(a.luoFarmari());
        System.out.println(a.luoPaita());
        System.out.println(a.luoKengat());
        System.out.println(a.luoLippis());
    }
    
}
