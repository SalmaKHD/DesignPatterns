package behavioral.visitor;

public interface Visitor {
    public void visitCD(CD cd);
    public void visitDVD(DVD dvd);
    public void visitBook(Book book);
    public double getTotalPrice();
}

class USPostageVisitor implements Visitor {
    private double totalPostageCart;

    @Override
    public void visitCD(CD cd) {
        if(cd.getPrice() < 20) {
            totalPostageCart += cd.getWeight()  * 2.5;
        }
        
    }

    @Override
    public void visitDVD(DVD dvd) {
       if(dvd.getPrice() < 20) {
           totalPostageCart += dvd.getWeight()  *3;
       }
        
    }

    @Override
    public void visitBook(Book book) {
        if(book.getPrice() < 20 ) {
            totalPostageCart += book.getWeight() *1;
        }
    }
    @Override
    public double getTotalPrice() {
        return totalPostageCart;
    }
}

class SouthAmericaPostageVisitor implements Visitor {
    private double totalPostageCart;

    @Override
    public void visitCD(CD cd) {
        if(cd.getPrice() < 20) {
            totalPostageCart += cd.getWeight()  * 2.5 *2;
        }
        
    }

    @Override
    public void visitDVD(DVD dvd) {
       if(dvd.getPrice() < 20) {
           totalPostageCart += dvd.getWeight()  *3 *2;
       }
        
    }

    @Override
    public void visitBook(Book book) {
        if(book.getPrice() < 20 ) {
            totalPostageCart += book.getWeight() *1 *2;
        }
    }
    @Override
    public double getTotalPrice() {
        return totalPostageCart;
    }
}
