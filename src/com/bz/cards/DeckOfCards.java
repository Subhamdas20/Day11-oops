package com.bz.cards;

import java.util.Random;

public class DeckOfCards {
    /*
     * Creating a deck of cards shuffling it and distributing it to players
     */
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[][] deck = new String[suits.length][ranks.length];

    /*
     * deckOfCard is used to initialize the deck with cards
     */
    public void deckOfCard() {
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[i][j] = suits[i] + "" + ranks[j] + " ";
            }
        }
    }

    /*
     * shuffleCard are used to shuffle the deck
     */
    public void shuffleCard() {
        Random random = new Random();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                int r = (random.nextInt(suits.length));
                int k = (random.nextInt(ranks.length));
                String temp = deck[r][k];
                deck[r][k] = deck[i][j];
                deck[i][j] = temp;
            }
        }
    }

    /*
     * display method is used to display the shuffled deck
     */
    public void display() {
        for (int i = 0; i < suits.length; i++) {
            System.out.print(" person" + i + "	");
            for (int j = 0; j < ranks.length; j++) {
                System.out.print(deck[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DeckOfCards obj = new DeckOfCards();
        obj.deckOfCard();
        obj.shuffleCard();
        obj.display();
    }

}
