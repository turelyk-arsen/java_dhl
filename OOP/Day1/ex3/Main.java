package OOP.Day1.ex3;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("dog's name", "black");
        Cat myCat = new Cat("small", 1);

        myCat.say();
        myDog.say();

        System.out.println("My cat age is: " + myCat.getAge());
        System.out.println(myDog.getName());

        System.out.println("change the info");
        myCat.setAge(4);
        myDog.setName("fuffy");
        System.out.println(myCat.getAge());
        System.out.println(myDog.getName());

        myCat.getInfo();
        myCat.scratch();
        myCat.changeMood();
        System.out.println("The cats mood is " + myCat.getMood());
        myCat.scratch();
    }
}
