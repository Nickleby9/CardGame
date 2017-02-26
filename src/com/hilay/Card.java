package com.hilay;

/**
 * Created by Android2017 on 2/21/2017.
 */
public class Card {

    String rank, suit;
    int cardNumber;
    String cardDetails;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    int getValue() {
        switch (rank) {
            case "King":
            case "Queen":
            case "Jack":
                return 10;
            case "Ace":
                return 11;
            default:
                return Integer.parseInt(rank);
        }
    }

    String getSuit() {
        return suit;
    }

    String getDetails() {
        return (rank + " of " + suit);
    }

    String getRank() {
        return rank;
    }

}
