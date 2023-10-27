
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.setName(name);
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }
}
