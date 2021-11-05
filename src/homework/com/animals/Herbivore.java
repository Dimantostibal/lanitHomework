package homework.com.animals;

import homework.com.food.Food;
import homework.com.food.Grass;

public abstract class Herbivore extends Animal{

    @Override
    public int eat(Food food) {
        if (food instanceof Grass){
            if(hunger < 2) {
                hunger += satiety;
                System.out.println(getNameAnimal() + " травоядное животное - ему нравится " + ((Grass) food).getNameFood());
            } else {
                System.out.println(getNameAnimal() + " не голоден");
            }
            return hunger;
        } else {
            System.out.println(getNameAnimal() + " травоядное животное, он не будет есть мясо!!!");
        }
        return hunger;
    }
}