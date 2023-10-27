package OOP.Day1.ex2;

public class Apartment {

    ////attributes
    private int floor;
    private int door_n;
    private int bathrooms;
    private int bedrooms;

    ///construct
    public Apartment(int floor, int door_n, int bathrooms, int bedrooms) {
        this.floor = floor;
        this.door_n = door_n;
        this.bathrooms = bathrooms;
        this.bedrooms = bedrooms;
    }

    /////get method
    public int getFloor () {
        return this.floor;
    }
    public int getDoor () {
        return this.door_n;
    }
    public int getBath () {
        return this.bathrooms;
    }
    public int getBed () {
        return this.bedrooms;
    }

    //set method
    public void setFloor (int floor) {
        this.floor = floor;
    }
    public void setDoor (int door_n) {
        this.door_n = door_n;
    }
    public void setBath (int bathrooms) {
        this.bathrooms = bathrooms;
    }
    public void setBed (int bedrooms) {
        this.bedrooms = bedrooms;
    }
}
