package structural.facade;

public class Client {
    public static void main(String[] args) {
        HotelKeeper hotelKeeper = new AlphaHotelKeeper(new VegRestaurant(), new NonVegRestaurant(), new VegNoneBothRestaurant());
        hotelKeeper.getMenu("VegMenu").showMenu();
        hotelKeeper.getMenu("NonVegMenu").showMenu();
        hotelKeeper.getMenu("BothNonVeg").showMenu();
        /*
        OUTPUT
        Veg menu items...
        Non veg menu items...
        Veg Non veg items...    
        */
    }
}
