package soap.db;

import java.util.HashMap;
import java.util.Map;

import soap.model.Guest;
import soap.model. Restaurant;

public class DatabaseClass {
    private static Map<Long,Restaurant> restaurants = new HashMap<>();
    private static Map<Long,Guest> guests = new HashMap<>();

    public static Map<Long, Restaurant> getRestaurants() { return restaurants; }
    public static Map<Long, Guest> getGuests() {
        return guests;
    }


}
