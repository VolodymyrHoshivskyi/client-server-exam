package soap.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.HashMap;
import java.util.Map;
@XmlRootElement(name = "Restaurant")
public class Restaurant {

    private long id;
    private String name;
    private String street;

    public Restaurant() {

    }
    public Restaurant(long id, String name, String street) {
        this.id = id;
        this.name = name;
        this.street = street;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    private Map<Long, Guest> guests = new HashMap<>();


    @XmlTransient
    public Map<Long, Guest> getGuests() {
        return guests;
    }
    public void setGuests(Map<Long, Guest> guests) {
        this.guests = guests;
    }

}
