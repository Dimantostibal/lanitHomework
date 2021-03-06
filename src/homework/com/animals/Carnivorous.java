package homework.com.animals;

import homework.com.food.Food;
import homework.com.food.Meat;

public abstract class Carnivorous extends Animal {

    @Override
    public int eat(Food food) throws WrongFoodException {
        if (!(food instanceof Meat)) {
            throw new WrongFoodException();
        } else {
            if (hunger < 2) {
                hunger += satiety;
                System.out.println(getNameAnimal() + " плотоядное животное - ему нравится " + ((Meat) food).getNameFood() + " теперь сыт");
            } else {
                System.out.println(getNameAnimal() + " не голоден");
            }
            return hunger;
        }
    }
}
