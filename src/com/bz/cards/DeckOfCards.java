package com.bz.cards;

import java.util.Arrays;
import java.util.Random;

public class DeckOfCards {
    /*
     * Creating a deck of cards shuffling it and distributing it to players
     */

    static LinkedList person1 = new LinkedList();
    static LinkedList person2 = new LinkedList();
    static LinkedList person3 = new LinkedList();
    static LinkedList person4 = new LinkedList();
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[][] deck = new String[suits.length][ranks.length];

    /*
     * deckOfCard is used to initialize the deck with cards
     */
    public void deckOfCard() {
        for (int row = 0; row < suits.length; row++) {
            for (int column = 0; column < ranks.length; column++) {
                deck[row][column] = ranks[column] + "-" + suits[row] + " ";
            }
        }
    }

    /*
     * shuffleCard are used to shuffle the deck
     */
    public void shuffleCard() {
        Random random = new Random();
        for (int row = 0; row < suits.length; row++) {
            for (int column = 0; column < ranks.length; column++) {
                int r = (random.nextInt(suits.length));
                int k = (random.nextInt(ranks.length));
                String temp = deck[r][k];
                deck[r][k] = deck[row][column];
                deck[row][column] = temp;
            }
        }
    }

//    public void sortShuffledDeck() {
//        String[] splitDeck;
//        int i = 0;
//        for (int row = 0; row < suits.length; row++) {
//
//            for (int column = 0; column < ranks.length; column++) {
//
//                String p = deck[row][column];
//                splitDeck = p.split("-");
////                if (splitDeck.equals("Ace")) {
//                    if (i < 13)
//                        person1.push(p);
//                    else if (i >= 13 && i < 26) person2.push(p);
//                    else if (i >= 26 && i < 39) person3.push(p);
//                    else person4.push(p);}
////
//
//                i++;
//            }
//
//        }

//    }


    /*
     * display method is used to display the shuffled deck
     */
    public void display() {
        for (int row = 0; row < suits.length; row++) {
            System.out.print(" person" + row + " ");
            for (int column = 0; column < ranks.length; column++) {
                System.out.print(deck[row][column]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DeckOfCards play = new DeckOfCards();
        play.deckOfCard();
        play.shuffleCard();
        play.display();

    }

}
