package Ex0108;

public class CardEx {

	public static void main(String[] args) {
		 Deck deck = new Deck();
	      
	      for (int suitNumber = 1; suitNumber <= 4; suitNumber++) {
	            for (int rankNumber = 1; rankNumber <= 13; rankNumber++) {
	                Card newCard = new Card(suitNumber, rankNumber);

	                deck.addCard(newCard);
	            }
	        }
	      
	      deck.print();

	}

}
