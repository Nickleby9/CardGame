package com.hilay;

public class Main {

    static int playerScore = 0, dealerScore = 0;

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();
//        deck.getCards();
        int choice = IO.getInt("Welcome to BlackJack!\nPlease choose you option: \n" +
                " 1. Begin game \n 2. Exit");

            while (choice != 2) {
                Game game = new Game();
                if ((game.isGameOver == true) && (game.checkBlackJack() == true)) {
                    playerScore += 1.5;
                    System.out.println("The winner is player by BlackJack!");
                    printScore();
                } else if ((game.getIsGameOver() == true) && (game.checkBlackJack() == false)) {
                    System.out.println("There is a Tie.");
                } else {
                    game.play();
                    if (game.getWhoWon().equals("Player")) {
                        playerScore += 1;
                        System.out.println("The winner is Player!");
                        printScore();
                    } else if (game.getWhoWon().equals("Dealer")) {
                        dealerScore += 1;
                        System.out.println("The winner is Dealer!");
                        printScore();
                    } else {
                        System.out.println("There is a Tie.");
                        printScore();
                    }
                }
                choice = IO.getInt("Press '1' to continue or '2' to quit:");
            }
            if (playerScore > dealerScore){
                System.out.println("Player won the game!");
            } else if (dealerScore > playerScore){
                System.out.println("Dealer won the game!");
            } else {
                System.out.println("The game has ended with a tie.");
            }
            System.out.println("Goodbye!");
    }

    static void printScore() {
        System.out.println("Player has " + playerScore + " points.\nDealer has " + dealerScore + " points.");
    }
}
