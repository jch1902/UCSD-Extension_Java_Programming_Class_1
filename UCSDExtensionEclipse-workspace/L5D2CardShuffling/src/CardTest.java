
public class CardTest {

	public static void main(String[] args) {
		System.out.println("Deck of Cards Test");
		DeckOfCards myDeckOfCards = new DeckOfCards();

		System.out.println(myDeckOfCards);
		System.out.println("Cards out before shuffle");
		//Shuffle the cards
		myDeckOfCards.Shuffle();
		System.out.println("Cards after shuffle");
		System.out.println(myDeckOfCards);
		
		//Print all 52 cards in order they are dealt
		for(int i = 1; i <= 52; i++) {
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			//Output a newline every 4th card
			if(i%4 == 0) {
				System.out.println();
			}
		}
		
		//Another way to deal all cards
		System.out.println("Another way to deal the cards");
		myDeckOfCards.Shuffle();
		Card card = myDeckOfCards.dealCard();
		while(card != null) {
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			card = myDeckOfCards.dealCard();
		}
		
		//Yet another way
		myDeckOfCards.Shuffle();
		card = myDeckOfCards.dealCard();
		do {
			System.out.printf("%-19s%n", card);
			card = myDeckOfCards.dealCard();
				
		}while(card != null);
		System.out.println("All done");
		
		//Another method
		myDeckOfCards.Shuffle();
		while(true) {
			card = myDeckOfCards.dealCard();
			if(card == null)break;
			System.out.printf("%-19s%n", card);
			
		}
		System.out.println("All done");

	}

}
