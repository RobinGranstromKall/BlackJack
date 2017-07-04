package se.kallrobin.Game;

import se.kallrobin.Deck.Card;
import se.kallrobin.Deck.Deck;
import se.kallrobin.Deck.Rank;

import java.util.ArrayList;

public class Game {
    Deck deck = new Deck();

    ArrayList<Card> dealersHand = new ArrayList<>();
    ArrayList<Card> playersHand = new ArrayList<>();


    public void startGame(){
        deck.shuffle();
        dealersHand.add(deck.pullCardFromDeck());
        playersHand.add(deck.pullCardFromDeck());
        dealersHand.add(deck.pullCardFromDeck());
        playersHand.add(deck.pullCardFromDeck());
        System.out.println("Dealers Hand");
        showHand(dealersHand);
        System.out.println("Players Hand");
        showHand(playersHand);
        checkBlackJack(dealersHand);
        checkBlackJack(playersHand);
    }

    public void hit(){
        playersHand.add(deck.pullCardFromDeck());
        checkBust(playersHand);
        checkBlackJack(playersHand);
        showHand(playersHand);
    }

    public void hit(ArrayList<Card> hand){
        hand.add(deck.pullCardFromDeck());
        checkBust(hand);
        checkBlackJack(hand);
        showHand(hand);
    }

    public void stay(){
        dealerLogic();
    }

    public void dealerLogic(){
        while (handValue(playersHand) > handValue(dealersHand)){
            hit(dealersHand);
        }
    }

    public int handValue(ArrayList<Card> hand){
        int totalValue = 0;
        int aces = 0;
        for (Card aHand : hand) {
            if (aHand.getRank() == Rank.ACE) {
                aces = 1 + aces;
            }
            totalValue = aHand.getRank().getRankInt() + totalValue;
        }
        for (int i = 0; i < aces; i++) {
            if(aces != 0 && totalValue + 10 <= 21){
                totalValue = totalValue + 10;
            }
        }
        return totalValue;
    }

    public void showHand(ArrayList<Card> hand){
        for (Card aHand : hand) {
            System.out.println(aHand.toString());
        }
        System.out.println(handValue(hand));

    }

    public void checkBlackJack(ArrayList<Card> hand){
        if (handValue(hand) == 21){
            System.out.println("BLACKJACK");
        }
    }

    public void checkBust(ArrayList<Card> hand){
        if (handValue(hand) > 21){
            System.out.println("BUST");
        }
    }
}
