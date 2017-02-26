package com.hilay;

import java.util.ArrayList;

/**
 * Created by Android2017 on 2/21/2017.
 */
import java.util.ArrayList;


public class Hand {
    //Properties:
    //ArrayList<Card> cards
    ArrayList<Card> cards = new ArrayList<>();

    public void addCard(Card c){
        cards.add(c);
    }

    public int getValue(){
        int value = 0;
        int aceCount = 0;

        for (Card card : cards) {
            value += card.getValue();
            if (card.getValue() == 11)
                aceCount++;
        }

        while (value > 21 && aceCount > 0) {
            value -= 10;
            aceCount--;
        }
        return value;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getCardsNum()
    {
        return cards.size();
    }
}