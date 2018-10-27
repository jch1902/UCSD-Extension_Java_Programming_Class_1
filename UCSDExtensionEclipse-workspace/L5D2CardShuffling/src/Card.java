
public class Card {
	//private number variables
	private final String face;
	private final String suit;
	
	//Constructor
	public Card(String cardFace, String cardSuit) {
		this.face = cardFace;
		this.suit = cardSuit;
	}
	//toString method
	public String toString() {
		return face + " of " + suit;
	}
	
}
