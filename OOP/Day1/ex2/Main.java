package OOP.Day1.ex2;

public class Main {

    public static void main(String[] args) {
    OfficeBuilding office = new OfficeBuilding(5, "Name", 45.23, 5);
    Apartment house = new Apartment(2, 12, 2, 3);
    Apartment house2 = new Apartment(2, 12, 2, 3);

    System.out.println(office.getName());
    System.out.println(office.getFloor());
    office.setFloor(10);
    System.out.println(office.getFloor());

    System.out.println("\n");
    System.out.println(office.getSize());

    System.out.println(office);
    System.out.println(house);
    System.out.println(house2);

    if(house.equals(house2))
        System.out.println("EQUAL");
        else 
        System.out.println("NO !!!!");

        if(house==house2)
        System.out.println("EQUAL");
        else 
        System.out.println("NO !!!!");


    }

    
}
