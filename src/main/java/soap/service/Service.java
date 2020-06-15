package soap.service;

import soap.model.Restaurant;
import soap.resource.GuestsResource;
import soap.resource.RestaurantResource;
import soap.model.Guest;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "soap.service.ServiceInterface", portName = "MyServicePort", serviceName = "MyService")
public class Service implements ServiceInterface {
    GuestsResource guestsResource = new GuestsResource();
    RestaurantResource restaurantResource = new RestaurantResource();
    @Override
    public List<Guest> getAllGuests(long restaurantId) {
        return guestsResource.getAllGuests(restaurantId);
    }

    @Override
    public List<Restaurant> getAllRestaurants() {return restaurantResource.getAllRestaurants();}
    @Override
    public Guest addGuest(long restaurantId, Guest guest) {
        return guestsResource.addGuest(restaurantId, guest);
    }
    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantResource.addRestaurant(restaurant);
    }
    @Override
    public void deleteGuest(long restaurantId, long guestId) {
        guestsResource.removeGuest(restaurantId, guestId);
    }
    @Override
    public void deleteRestaurant(long id) {
        restaurantResource.removeRestaurant(id);
    }
    @Override
    public Guest updateGuest(long restaurantId, long id, Guest guest) {
        guest.setId(id);
        return guestsResource.updateGuest(restaurantId, guest);
    }
    @Override
    public Restaurant updateRestaurant(long id, Restaurant restaurant) {
        restaurant.setId(id);
        return restaurantResource.updateRestaurant(restaurant);
    }

}
