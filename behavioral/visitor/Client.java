package behavioral.visitor;

import java.util.ArrayList;

import javax.xml.transform.Source;

public class Client {
    public static void main(String[] args) {
        ArrayList<Element> elements = new ArrayList<Element>();
        elements.add(new Book(34, 12));
        elements.add(new DVD(12, 2));
        elements.add(new CD(12, 1));

        Visitor visitor1 = new SouthAmericaPostageVisitor();
        Visitor visitor2  = new USPostageVisitor();

        for(Element element: elements) {
            element.accept(visitor1);
        }
        for(Element element: elements) {
            element.accept(visitor2);
        }
        System.out.println("The total cost of South America is: " + visitor1.getTotalPrice());
        System.out.println("The total cost of US is: " + visitor2.getTotalPrice());
        /*
        OUTPUT
        The total cost of South America is: 17.0
        The total cost of US is: 8.5
        */
    }
}