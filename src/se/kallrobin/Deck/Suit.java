package se.kallrobin.Deck;

public enum Suit {
	HEARTS("Hearts"),
	SPADES("Spades"),
	DIAMONDS("Diamonds"),
	CLUBS("Clubs");
	
private final String suitStr;
	
	private Suit(String suitStr){
		this.suitStr = suitStr;
	}
	
	// To return the enum value as corresponding String 
	public String printSuit(){
		return suitStr;
	}
}
