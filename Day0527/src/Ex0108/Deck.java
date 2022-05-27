package Ex0108;

import java.util.*;

public class Deck {
	
	private ArrayList<Card> cards;
	
	public Deck() {
		cards = new ArrayList<Card>();
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public ArrayList<Card> getCards(){
		return cards;
	}
	
	public void print() {
		for(Card card:cards) {
			System.out.println(card.toString());
		}
	}
	
	public Deck deal (int count) {
		Deck hand = new Deck();
		
		for(int i=0;i<count;i++) {
			hand.addCard(cards.remove(0));
		}
		
		return hand;
	}

}
