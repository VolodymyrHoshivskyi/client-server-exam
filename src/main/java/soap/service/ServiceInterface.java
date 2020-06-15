package soap.service;

import java.util.List;

import soap.model.Restaurant;
import soap.model.Guest;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "My", targetNamespace = "http://www.mysoap.example.com")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)

public interface ServiceInterface {
    @WebMethod
    List<Guest> getAllGuests(long restaurantId);
    @WebMethod
    List<Restaurant> getAllRestaurants();
    @WebMethod
    Guest addGuest(long restaurantId, Guest guest);
    @WebMethod
    public Restaurant addRestaurant(Restaurant restaurant);
    @WebMethod
    void deleteRestaurant(long id);
    @WebMethod
    void deleteGuest(long restaurantId, long guestId);
    @WebMethod
    Guest updateGuest(long restaurantId, long id, Guest guest);
    @WebMethod
    Restaurant updateRestaurant(long id, Restaurant restaurant);

}
