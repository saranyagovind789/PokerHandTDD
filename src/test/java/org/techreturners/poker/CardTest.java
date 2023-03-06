package org.techreturners.poker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CardTest {
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

}
