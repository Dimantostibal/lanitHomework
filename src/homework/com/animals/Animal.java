package homework.com.animals;

import homework.com.food.Food;

public abstract class Animal {

    String name;
    public final int satiety = 5; // Сколько получит животное единиц сытости когда поес.
    public int hunger = satiety; // Единица сытости

    public abstract int eat(Food food);

    public abstract String getNameAnimal();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}