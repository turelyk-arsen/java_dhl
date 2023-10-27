package OOP.Day1.ex3;

public class Cat {
    private String size;
    private int age;
    private boolean mood;

    public Cat (String size, int age) {
        this.size =size;
        this.age = age;
        this.mood = false;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void setAge(int age) {
        this.age  = age;
    }

    public String getSize() {
        return size;
    }
    public int getAge() {
        return age;
    }
    public boolean getMood() {
        return mood;
    }

    public void say() {
        System.out.println("May!");
    }

    public void getInfo () {
        System.out.println(this.getAge());
        System.out.println(this.getSize());
        System.out.println(this.mood);
    }

    public void changeMood () {
        this.mood = !this.mood;
    }

    public void scratch() {
        if(!this.mood) {
            System.out.println("Say bood bye to your furnitures");
        } else {
            System.out.println("Your furnitures are safe (for now...)");
        }
    }
}
