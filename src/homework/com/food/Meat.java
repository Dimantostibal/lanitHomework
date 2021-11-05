package homework.com.food;

public class Meat extends Food{

    private String name;

    public Meat(String name) {
        this.name = name;
    }

    public String getNameFood() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}