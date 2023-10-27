package OOP.Day1.ex2;

public class OfficeBuilding {
    private int floor;
    private String name;
    private double size;
    private int room;

    public OfficeBuilding (int floor, String name, double size, int room) {
        this.floor = floor;
        this.name = name;
        this.size = size;
        this.room = room;
    }

    //get method
    public int getFloor() {
        return floor;
    }
    public String getName() {
        return name;
    }
    public double getSize() {
        return size;
    }
    public int getRoom() {
        return room;
    }

    ///set methods
    public void setFloor(int floor) {
        this.floor = floor;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setRoom(int room) {
        this.room = room;
    }

}
