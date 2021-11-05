package homework.com.animals;

import homework.com.food.Food;

public abstract class Animal {

    protected final int satiety = 5; // Сколько получит животное единиц сытости когда поес.
    protected int hunger = satiety; // Единица сытости
    protected AviarySizeEnum aviarySizeEnum;

    public abstract int eat(Food food) throws WrongFoodException;

    public abstract String getNameAnimal();

    public void setAviarySizeEnum(AviarySizeEnum aviarySizeEnum) {
        this.aviarySizeEnum = aviarySizeEnum;
    }

    public AviarySizeEnum getAviarySizeEnum() {
        return aviarySizeEnum;
    }
}
