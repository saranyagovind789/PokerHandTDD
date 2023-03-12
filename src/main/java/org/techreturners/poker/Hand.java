package org.techreturners.poker;

import java.util.Arrays;

public class Hand {
    public static enum handRank{
        HIGHCARD, PAIR, TWOPAIR, THREEOFAKIND,
        STRAIGHT, FLUSH,
        FULLHOUSE, FOUROFAKIND, STRAIGHTFLUSH
    }

    private final Card[] playerHand;
    private final String playerName;

    public Hand(){
        playerHand =null;
        playerName = "";
    }

    public Hand(String currentHandString,String  playerName){
        String[] cards = currentHandString.split(" ");
        this.playerHand = new Card[cards.length];
        for(int i =0; i< playerHand.length; i++){
            playerHand[i] = new Card(cards[i]);
        }
        Arrays.sort(playerHand);
        this.playerName = playerName;
    }

    public Card[] getPlayerHand(){
        return playerHand;
    }

    public String getPlayerName(){
        return playerName;
    }


    public boolean isFlush(Card[] currentHand){
        // Flush: Hand contains 5 cards of the same suit.
        for (int i=0;i<currentHand.length-1;i++){
            if (currentHand[i+1].getSuit() != currentHand[i].getSuit()){
                return false;
            }
        }
        return true;
    }

    public boolean isStraight(Card[] currentHand){
        //Straight : Hand contains 5 cards with Consecutive Values
        return currentHand[4].getValue() - currentHand[0].getValue()==4;

    }

}
