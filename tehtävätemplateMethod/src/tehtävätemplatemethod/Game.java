/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävätemplatemethod;

/**
 *
 * @author Santeri
 */

 abstract class Game {

    protected int playersCount;

    abstract void initializeGame();

    abstract void makePlay(int player);

    abstract boolean endOfGame();

    abstract void printWinner();

    /* A template method : */
    public final void playOneGame(int playersCount) {
        this.playersCount = playersCount;
        initializeGame();
        int j = 1;
        while (!endOfGame()){
            makePlay(j);
            j = (j + 1) % playersCount;
           
        }
        printWinner();
    }
 }
