package se.kallrobin.Deck;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Deck {
	private Stack<Card> deck;

	// Constructor
	public Deck() {
		this.deck = new Stack<Card>();
		for (Suit suit : Suit.values()) {			//For each Suit in suit take the Suit enum value
			for (Rank rank : Rank.values()) {		//For each Rank in rank take the Rank enum value
				Card card = new Card(rank, suit);	//Create new Card with rank and suit according to enum value
				this.deck.push(card);				//Add cards to deck
			}
		}
	}
	//Clear the arrayList
	public void clear() {
		deck.clear();
	}
	//Sort arrayList according to enum value
	public void shuffle() {
		Collections.shuffle(deck);
	}
	//Show the arrayList in the given order
	public Card pullCardFromDeck(){
		return deck.pop();
	}
}
