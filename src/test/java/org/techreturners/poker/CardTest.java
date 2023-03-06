package org.techreturners.poker;
import org.junit.jupiter.api.Test;

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
    void ranking() {
        Card cardObj = new Card("2C");
        assertEquals(8,cardObj.getRank());
    }
    @Test
    void ranking1() {
        Card cardObj = new Card("AS");
        assertEquals(59,cardObj.getRank());
    }
}
