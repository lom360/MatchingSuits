package com.example.demo.model;

public class Card {
	public enum Suit {
		HEARTS('H'),
		DIAMONDS('D'),
		CLUBS('C'),
		SPADES('S');
		
		private final char value;
		
		Suit(char value) {
			this.value = value;
		}
		
		public char getValue() {
			return value;
		}
	}
	
	private final Suit suit;
	private final char rank;
	
	public Card(Suit suit, char rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public Suit getSuit() {
		return this.suit;
	}
	
	public char getChar() {
		return this.rank;
	}
	
	@Override
	public String toString() {
		return String.format("%c%c", rank, suit.getValue());
	}
}
