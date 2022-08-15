package DataStructure;

import java.util.Vector;

public class Stack extends Vector {
        private String[] stack = new String[3];
        private boolean isEmpty = true;
        private int count;


        @Override
        public boolean isEmpty(){
            return isEmpty;
        }
        @Override
        public String get(int id){
            return stack[id];
        }
        @Override
        public int size() {
            return count;
        }
        public void set(int id, String element){
            stack[id] = element;
        }
        public void add(String item){
            isEmpty = false;
            stack[count] = item;
            count++;
        }
        public String remove(){
            count--;
            return stack[stack.length - 1];
        }
        public String view(){
            return stack[stack.length - 1];
        }
        public int search(String element){
            for(int v = 0;v < stack.length;v++){
                if(stack[v] == element){
                    return v++;
                }
            }
            return - 1;
        }
    }
