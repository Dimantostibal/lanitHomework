package homework.com.animals;

import homework.com.food.Food;
import homework.com.food.Meat;

public abstract class Carnivorous extends Animal{

    @Override
    public int eat(Food food) {
        if (food instanceof Meat){
            if(hunger < 2) {
                hunger += satiety;
                System.out.println(getNameAnimal() + " плотоядное животное - ему нравится " + ((Meat) food).getNameFood() + " теперь сыт");
            } else {
                System.out.println(getNameAnimal() + " не голоден");
            }
            return hunger;
        } else {
            System.out.println(getNameAnimal() + " плотоядное животное, он не будет это есть, нужно мясо!!!");
        }
        return hunger;
    }
}