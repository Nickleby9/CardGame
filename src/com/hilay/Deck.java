package com.hilay;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Android2017 on 2/21/2017.
 */
public class Deck {

    ArrayList<Card> cards = new ArrayList<Card>();
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] suit = {"♥", "♦", "♣", "♠"};

    Deck() {
        for (String ranks : rank) {
            for (String suits : suit) {
                cards.add(new Card(ranks, suits));
            }
        }
    }

    void getCards() {
        for (Card card : cards) {
            System.out.println(card.getDetails());
        }
    }

    void shuffle() {
        ArrayList<Card> shuffled = new ArrayList<Card>();
        Random r = new Random();
        while (cards.size() > 0) {
            shuffled.add(cards.remove(r.nextInt(cards.size())));
        }
        cards = shuffled;
    }

    Card draw() {
        return cards.remove(0);
    }

    boolean isEmpty() {
        return cards.isEmpty();
    }

}
