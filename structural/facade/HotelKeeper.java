package structural.facade;

public interface HotelKeeper {
    public Menus getMenu(String resturantType);
}

class AlphaHotelKeeper implements HotelKeeper {
    VegRestaurant vegRestaurant;
    NonVegRestaurant nonVegRestaurant;
    VegNoneBothRestaurant vegNoneBothRestaurant;

    public AlphaHotelKeeper(
        VegRestaurant vegRestaurant,
        NonVegRestaurant nonVegRestaurant,
        VegNoneBothRestaurant vegNoneBothRestaurant
    ) {
      this.vegRestaurant =vegRestaurant ;
         this.nonVegRestaurant = nonVegRestaurant;
     this.vegNoneBothRestaurant = vegNoneBothRestaurant;
    }

    @Override
    public Menus getMenu(String resturantType) {
        if(resturantType.equalsIgnoreCase("VegMenu")) {
            return vegRestaurant.getMenus();
        } else if(resturantType.equalsIgnoreCase("NonVegMenu")) {
            return nonVegRestaurant.getMenus();
        } else if(resturantType.equalsIgnoreCase("BothNonVeg")) {
            return vegNoneBothRestaurant.getMenus();
        } else {
            return null;
        }
    }
}
