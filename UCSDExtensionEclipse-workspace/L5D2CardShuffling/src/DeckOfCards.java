import java.security.SecureRandom;

public class DeckOfCards {
	private static final SecureRandom sr = new SecureRandom();
	private static final int NUMBER_OF_CARDS = 52;
	private  Card[] deck = new Card[NUMBER_OF_CARDS];
	private int currentCard = 0;
	// Constructor 
	public DeckOfCards() {
		String[] faces = {"Ace","Two","Three","Four",
				"Five","Six","Seven","Eight","Nine",
				"Ten","Jack","Queen","King"};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		for(int i = 0; i < deck.length; i++) {
			deck[i] = new Card(faces[ i % 13], suits[ i /13]);
		}
	}
	//Shuffle the cards
	public void Shuffle() {
		currentCard = 0;
		//for each card, pick another random card and swap their places
		for (int first = 0; first < deck.length; first++) {
			int second = sr.nextInt(NUMBER_OF_CARDS);
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	//Deal a card
	public Card dealCard() {

		// Determine whether cards are still available
		if(currentCard < deck.length) {
			return deck[currentCard++];
		}else {
			return null; //Return null to indicate no more cards
		}
	}
	public String toString() {
		String msg = "";
		//**for(Card c : deck) {
		//	msg += c.toString();
		//**}
		for(int i = 0; i < deck.length; i ++) {
			msg += deck[i] + " ";
			System.out.printf("%-19s", deck[i]);
			if(i % 4 == 0) msg += "\n";
		}
		return msg;
	}
}
