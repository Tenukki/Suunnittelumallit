/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävätemplatemethod;

import java.util.Scanner;

/**
 *
 * @author Santeri
 */
public class KPS extends Game{
    
    private int kierrokset = 0 ;
    private int ekaVoitot = 0;
    private int tokaVoitot = 0;
    
    private String ekaKäsi = null;
    private String tokaKäsi = null;
    
    @Override
    void initializeGame() {
        System.out.println("Peli alkaa, kierroksia on " + 3);
        
    }

    @Override
    void makePlay(int player) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna syötä sakset,kivi tai paperi");
        String sana = lukija.nextLine();
        
        if(player == 1){
            if(sana.equals("sakset")){
            ekaKäsi = "sakset";
            }else if(sana.equals("kivi")){
                ekaKäsi = "kivi";
            }else if(sana.equals("paperi")){
                ekaKäsi = "paperi";
            }
        }else{
            if(sana.equals("sakset")){
                tokaKäsi = "sakset";
            }else if(sana.equals("kivi")){
                tokaKäsi = "kivi";
            }else if(sana.equals("paperi")){
                tokaKäsi = "paperi";
            }
            kierrokset++;
        }
        
        
    }

    @Override
    boolean endOfGame() {
        //Kirjoita info lauseke joka vertailee kädet ja katsoo kumpi saa pisteen
        if(kierrokset == 3){
            return true;
        }else if(kierrokset == 0){
            return false;
        }
        
        if((ekaKäsi.equals("sakset") && tokaKäsi.equals("paperi")) || (ekaKäsi.equals("paperi") && tokaKäsi.equals("kivi")) || (ekaKäsi.equals("kivi") && tokaKäsi.equals("sakset"))){
            ekaVoitot++;
            return false;
        }else{
            tokaVoitot++;
            return false;
        }
        
        
        
        //kun kierokset täynnä katso kummalla ennemmän pisteitä ja palauta 
    }

    @Override
    void printWinner() {
        if(ekaVoitot > tokaVoitot){
            System.out.println("Voittaja on ensimmäiseksi aloittanut pelaaja");
            System.out.println("eka voitot " + ekaVoitot);
            System.out.println("toka voitot" + tokaVoitot);
        }else{
            System.out.println("Voittaja on tokaksi aloittanut pelaaja");
            System.out.println("eka voitot " + ekaVoitot);
            System.out.println("toka voitot" + tokaVoitot);
        }
    }
    
}
