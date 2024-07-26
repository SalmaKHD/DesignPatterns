package behavioral.iterator;

public class Client {
    public static void main(String[] args) {
        // create class
        Subject subject = new Arts();
        // get iterator
        Iterator iterator = subject.getIterator();
         
          // traverse the list using the iterator
        while(!(iterator.isDone())) {
            System.out.println(iterator.next());
        }
       /*
       OUTPUT
       Design
       Painting
       */

       
       
    }
}
