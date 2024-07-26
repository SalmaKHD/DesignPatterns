package structural.facade;

public interface Menus {
    public void showMenu();

}

class VegMenu implements Menus {
    public void showMenu() {
        System.out.println("Veg menu items...");
    }
}

class NonVegMenu implements Menus {
    public void showMenu() {
        System.out.println("Non veg menu items...");
    }
}

class VegNoneBothMenu implements Menus {
    public void showMenu() {
        System.out.println("Veg Non veg items...");
    }
}
