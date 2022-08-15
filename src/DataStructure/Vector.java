package DataStructure;

    public class Vector implements List{

        private boolean isEmpty = true;
        private int count;
        private String[] element = new String[5];

        @Override
        public void add(String item) {
            isEmpty= false;
            element[count] = item;
            count++;
        }
        @Override
        public void remove(int id) {
            element[id] = null;
            count--;
        }

        @Override
        public void remove(String item) {
            for(int v = 0;v < element.length;v++){
                if(element[v] == item ){
                    element[v] = null;
                }
            }
        }

        @Override
        public String get(int id) {
            return element[id];
        }

        @Override
        public void add(int id, String item) {
            for(int v = element.length - 1;v > id; v--){
                element[v] = element[v -1];
            }
            element[id] = item;
            count++;
        }

        @Override
        public void clear() {
            for(int v = 0; v < element.length; v++){
                element[v] = null;
                isEmpty = true;
            }
        }

        @Override
        public int size() {
            return count;
        }

        @Override
        public boolean isEmpty() {
            return isEmpty;
        }

        @Override
        public boolean contains(String otherItem) {
            for (int i = 0; i < element.length; i++) {
                if (element[i] == otherItem) {
                    return true;
                }
            }
            return false;


        }
        public void set(int id, String otherItem){
            element[id] = otherItem;
            count++;
        }
    }

