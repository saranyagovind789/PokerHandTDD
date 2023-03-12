package org.techreturners.poker;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class CardTest  {
    @Test
    public void testEquals(){
        Card cardObj1 =new Card("2C");
        Card cardObj2 = new Card("2C");
    assertEquals(cardObj1, cardObj2);
    }

    @Test
    void testToString() {
        Card cardObj1 = new Card("3D");
        assertEquals("[3D]",cardObj1.toString());
    }

    @Test
    void compareTo() {
        Card cardObj1 = new Card("3C");
        Card cardObj2 = new Card("4D");
        assertEquals(-1,cardObj1.compareTo(cardObj2));
    }

    @Test
    void rankingof2CCard() {
        Card cardObj = new Card("2C");
        assertEquals(8,cardObj.getRank());
    }
    @Test
    void rankingofASCard() {
        Card cardObj = new Card("AS");
        assertEquals(59,cardObj.getRank());
    }

    @Test
    public void testIsFlush(){
        Hand handObj = new Hand();;
        Card[] currentHand = {new Card("2C"),new Card("3C"),new Card("4C"),new Card("5C"),new Card("6C")};
        Arrays.sort(currentHand);
        assertTrue(handObj.isFlush(currentHand));
    }

    @Test
    public void testIsStraight(){
        Hand handObj = new Hand();;
        Card[] currentHand = {new Card("2C"),new Card("3C"),new Card("4C"),new Card("5C"),new Card("6C")};
        Arrays.sort(currentHand);
        assertTrue(handObj.isStraight(currentHand));
    }


}
