package se.kallrobin.Deck;

public enum Rank {
	ACE("Ace", 1),
	TWO("Two", 2),
	THREE("Three", 3),
	FOUR("Four", 4),
	FIVE("Five", 5),
	SIX("Six",6),
	SEVEN("Seven", 7),
	EIGHT("Eight", 8),
	NINE("Nine", 9),
	TEN("Ten", 10),
	KNIGHT("Knight", 10),
	QUEEN("Queen", 10),
	KING("King", 10);

	private final String rankStr;
	private final int rankInt;

	Rank(String rankStr, int rankInt) {
		this.rankStr = rankStr;
		this.rankInt = rankInt;
	}

	public int getRankInt() {
		return rankInt;
	}

	// To return the enum value as corresponding String
	public String printRank() {
		return rankStr;
	}
}
