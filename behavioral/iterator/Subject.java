package behavioral.iterator;

import java.util.ArrayList;

public interface Subject {
    public Iterator getIterator();
}

class Arts implements Subject{
        // or any other underlying data strcuture
     ArrayList<String> subjects = new ArrayList<String>();
    private int position = 0;

    public Arts() {
        subjects.add("Design");
        subjects.add("Painting");
    }
    class ArtsIterator implements Iterator {
        @Override
        public void first() {
           position = 0;
        }

        @Override
        public String next() {
            if(position <= subjects.size()-1) {
                return subjects.get(position++);
            }
            return null;
        }

        @Override
        public boolean isDone() {
            return position >= subjects.size();
        }

        @Override
        public String currentItem() {
            if(position <= subjects.size()-1) {
                return subjects.get(position);
            }
            return null;
        }
        
    }

    @Override
    public Iterator getIterator() {
        return new ArtsIterator();
    }
    
}
