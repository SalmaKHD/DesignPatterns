package structural.facade;

public interface Hotel {
    public Menus getMenus();
}

class NonVegRestaurant implements Hotel {
    public Menus getMenus() {
        NonVegMenu nv = new NonVegMenu();
        return nv;
    }
}

class VegRestaurant implements Hotel {
    public Menus getMenus() {
        VegMenu nv = new VegMenu();
        return nv;
    }
}

class VegNoneBothRestaurant implements Hotel {
    public Menus getMenus() {
        VegNoneBothMenu nv = new VegNoneBothMenu();
        return nv;
    }
}