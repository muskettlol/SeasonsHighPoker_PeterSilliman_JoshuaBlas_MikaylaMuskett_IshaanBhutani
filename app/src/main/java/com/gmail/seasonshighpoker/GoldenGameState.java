package com.gmail.seasonshighpoker;

import java.util.ArrayList;
import java.util.List;

public class GoldenGameState {

    /** Instantiate variables and declare base values*/
    int potBalance = 0;
    // need to create card object class "Card"
    List<Card> deck = new ArrayList<Card>();
    List<Card> discardPile = new ArrayList<Card>();

    public GoldenGameState(){
        //Creates all 52 card objects and puts them into the deck arraylist
        String suit = null;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                if(i == 0){
                    suit = "Club";
                } else if(i == 1){
                    suit = "Heart";
                } else if(i == 2){
                    suit = "Diamond";
                } else {
                    suit = "Spade";
                }
                deck.add(new Card(j, suit));
            }
        }


    }

}
