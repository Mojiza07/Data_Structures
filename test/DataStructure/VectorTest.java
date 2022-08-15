 package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class VectorTest {
        @Test
        void testThatListIsBlank(){
            Vector victor = new Vector();
            assertTrue(victor.isEmpty());
        }
        @Test
        void testThatAnItemCanBeAdded(){
            Vector victor = new Vector();
            victor.add("Call Of Duty 2022");
            assertFalse(victor.isEmpty());
        }
        @Test
        void testThatMultipleItemsCanBeAdded(){
            Vector victor = new Vector();
            victor.add("Call Of Duty 2022");
            victor.add("God of war");
            victor.add("Residence Evil");
            victor.add("GTA 5");
            assertFalse(victor.isEmpty());

        }
        @Test
        void testGetMultipleItemByIndex() {
            Vector victor = new Vector();
            victor.add("Call Of Duty 2022");
            victor.add("God of war");
            victor.add("Residence Evil");
            victor.add("GTA 5");
            assertEquals("Call Of Duty", victor.get(0));
            assertEquals("God Of War", victor.get(1));
            assertEquals("Residence Evil", victor.get(2));
            assertEquals("GTA 5", victor.get(3));
        }
        @Test
        void testThatItemCanBeRemoved(){
            Vector victor = new Vector();
            victor.add("Call Of Duty");
            victor.add("God Of War");
            victor.add("Residence Evil");
            victor.add("GTA 5");
            victor.remove(0);
            assertEquals(null,victor.get(0));

        }
    }

