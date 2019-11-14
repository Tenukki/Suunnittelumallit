/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementto11;

import java.util.Scanner;

/**
 *
 * @author Santeri
 */
public class Mementto11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Pelaaja dd = new Pelaaja("santeri");
        dd.setpState(arvuuttaja.liityPeliin(dd));
        
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä luku");
        int luku = Integer.valueOf(lukija.nextLine());
        
        System.out.println(arvuuttaja.arvas(dd, luku));
    }
    
}
