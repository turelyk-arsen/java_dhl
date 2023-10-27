package OOP.Day1.ex2;

public class FamilyBuilding {
    private double size;
    private int floor;
    private int number;
    private int room;

    public FamilyBuilding(double size, int floor, int number, int room) {
        this.size = size;
        this.floor = floor;
        this.number = number;
        this.room = room;
    }

    public double setSize() {
        return size;
    }
    public void getSize(double size) {
        this.size = size;
    }

    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public int getRoom() {
        return room;
    }
    public void setRoom(int room) {
        this.room = room;
    }
    
}
