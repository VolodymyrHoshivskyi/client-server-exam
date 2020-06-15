package soap.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import soap.model.Guest;
import soap.model.Restaurant;
import soap.db.DatabaseClass;

public class RestaurantResource {
    private Map<Long, Restaurant> restaurants= DatabaseClass.getRestaurants();
    private Map<Long, Guest> guests;

    public List<Restaurant> getAllRestaurants() {
        return new ArrayList<Restaurant>(restaurants.values());
    }
    public Restaurant addRestaurant(Restaurant restaurant) {
        restaurant.setId(restaurants.size() + 1);
        return restaurant;
    }
    public Restaurant removeRestaurant(long id) {
        return restaurants.remove(id);
    }
    public Restaurant updateRestaurant(Restaurant restaurant) {
        if(restaurant.getId() <= 0) {
            return null;
        }
        restaurants.put(restaurant.getId(), restaurant);
        return restaurant;
    }



    public void setGuests(Map<Long, Guest> guests) {
        this.guests = guests;
    }
}
