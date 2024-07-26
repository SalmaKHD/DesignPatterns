package creational.builder;

import java.util.ArrayList;

public class Product {
    private ArrayList<String> parts;

    public Product() {
        parts = new ArrayList<String>();
        
    }

    public void add(String part) {
        parts.add(part);
    }
    public void show() {
        System.out.println("\n Product completed below");
        for(int i = 0; i< parts.size(); i++) {
            System.out.println(parts.get(i));
        }
    }
}
