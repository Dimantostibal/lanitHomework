package homework.com.worker;

import homework.com.animals.Animal;
import homework.com.animals.Voice;
import homework.com.food.Food;

public class Worker {

    public void feed(Animal animal, Food food){
        animal.eat(food);
    }

    public void getVoice (Voice animal){
        System.out.println(animal.voice());
    }
}