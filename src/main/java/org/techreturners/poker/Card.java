package org.techreturners.poker;

public class Card {
    private final int rank;
    private final char suit;
    private final int value;
    private final String values = "23456789TJQKA";
    private final String suits = "CDHS";

    public char getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public int getRank(){
        return rank;
    }

    public Card(String cardString) {
        rank = ranking(cardString);
        value = rank/suits.length();
        suit = suits.charAt(rank%suits.length());
    }

    public int compareTo(Card anotherCard) {
        return Integer.compare(this.getValue(), anotherCard.getValue());
    }

    public int ranking(String cardString){
        char value = cardString.charAt(0);
        char suit = cardString.charAt(1);
        for (int i=0;i<values.length();i++){
            if (values.charAt(i) == value){
                for (int j=0;j<suits.length();j++){
                    if (suits.charAt(j) == suit) return (i+2)*suits.length() + j;
                }
            }
        }
        return -1;
    }
    @Override
    public boolean equals(Object o){
        Card anotherCard = (Card) o;
        return this.getValue() == anotherCard.getValue();
    }

    @Override
    public String toString(){
        return "["+value+suit+"]";
    }

}
