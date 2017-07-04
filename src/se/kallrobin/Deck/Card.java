package se.kallrobin.Deck;

public class Card implements Comparable<Card> {
	private Suit suit;
	private Rank rank;

	// Constructor
	public Card(Rank rank, Suit suit) {
		this.suit = suit;
		this.rank = rank;
	}

	//Setters/Getters
	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	// Formating of string
	public String toString() {
		return "\t" + rank.printRank() + " of " + suit.printSuit();
	}

	@Override
	public int compareTo(Card o) {

		return this.rank.ordinal() - o.rank.ordinal();
	}
}
