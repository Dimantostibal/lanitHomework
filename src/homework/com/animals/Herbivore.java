package homework.com.animals;

import homework.com.food.Food;
import homework.com.food.Grass;

public abstract class Herbivore extends Animal {

    @Override
    public int eat(Food food) throws WrongFoodException {
        if (!(food instanceof Grass)) {
            throw new WrongFoodException();
        } else {
            if (hunger < 2) {
                hunger += satiety;
                System.out.println(getNameAnimal() + " травоядное животное - ему нравится " + ((Grass) food).getNameFood());
            } else {
                System.out.println(getNameAnimal() + " не голоден");
            }
            return hunger;
        }
    }
}
