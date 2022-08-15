

import DataStructure.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class StackTest {
        @Test
        void testThatStackExist(){
            Stack stacks = new Stack();
            assertNotNull(stacks);
        }
        @Test
        void testThatStackIsEmpty(){
            Stack stacks= new Stack();
            assertTrue(stacks.isEmpty());
        }
        @Test
        void testThatItemCanBeAddedToStack(){
            Stack stacks = new Stack();
            stacks.add("M-24");
            stacks.add("MachineGun");
            stacks.add("Tommy 1977");
            assertFalse(stacks.isEmpty());
        }
        @Test
        void testStackSize(){
            Stack stacks = new Stack();
            stacks.add("M-24");
            stacks.add("Machine Gun");
            stacks.add("Tommy 1977");
            assertEquals(3,stacks.size());
        }
        @Test
        void getValueAtStackTopIndex(){
            Stack stacks = new Stack();
            stacks.add("M-24");
            stacks.add("Machine Gun");
            stacks.add("Tommy 1977");
            assertEquals("Tommy 1977",stacks.view());
        }
        @Test
        void testToSearchForAValueInStack(){
            Stack stacks = new Stack();
            stacks.add("M-24");
            stacks.add("Machine Gun");
            stacks.add("Tommy 1987");
            assertEquals(0,stacks.search("M-24"));
        }
        @Test
        void testToRemoveValueInStack(){
            Stack stacks = new Stack();
            stacks.add("M-24");
            stacks.add("Machine Gun");
            stacks.add("Tommy 1977");
            String victor = stacks.remove();
            assertEquals("Tommy 1977",stacks.remove());

        }


    }


