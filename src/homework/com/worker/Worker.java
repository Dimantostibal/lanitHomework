package homework.com.worker;

import homework.com.animals.*;
import homework.com.food.Food;

public class Worker {

    public void feed(Animal animal, Food food){
        try {
            animal.eat(food);
        } catch (WrongFoodException e) {
            System.out.println("Для " + animal.getNameAnimal() + " эта еда не подходит");
        }
    }

    public void getVoice (Voice animal){
        System.out.println(animal.voice());
    }
}
