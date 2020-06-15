package soap.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import soap.model.Restaurant;
import soap.model.Guest;
import soap.db.DatabaseClass;

public class GuestsResource {
    private Map<Long, Restaurant> restaurants = DatabaseClass.getRestaurants();

    public List<Guest> getAllGuests(long restaurantId) {
        Map<Long, Guest> guests = restaurants.get(restaurantId).getGuests();
        return new ArrayList<Guest>(guests.values());
    }
    public Guest addGuest (long restaurantId, Guest guest) {
        Map<Long, Guest> guests = restaurants.get(restaurantId).getGuests();
        guest.setId(guests.size() + 1);
        guests.put(guest.getId(), guest);
        return guest;
    }
    public Guest removeGuest(long restaurantId, long guestId) {
        Map<Long, Guest> guests = restaurants.get(restaurantId).getGuests();
        return guests.remove(guestId);
    }
    public Guest updateGuest(long restaurantId, Guest guest) {
        Map<Long, Guest> guests = restaurants.get(restaurantId).getGuests();
        if(guest.getId() <= 0) {
            return null;
        }
        guests.put(guest.getId(), guest);
        return guest;
    }

}
