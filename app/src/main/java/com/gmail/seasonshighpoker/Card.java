package com.gmail.seasonshighpoker;

public class Card {

    //instantiate card value and suit
    int cardValue;
    String cardSuit;

    //create a card
    public Card(int value, String suit){
        //declare value and suit
        this.cardValue = value;
        this.cardSuit = suit;
    }

    public int getValue(){ return this.cardValue; }

    public String getSuit(){ return this.cardSuit; }

}
