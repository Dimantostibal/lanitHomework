package homework.com;

import homework.com.animals.*;
import homework.com.food.Food;
import homework.com.food.Grass;
import homework.com.food.Meat;
import homework.com.worker.Worker;

public class Zoo {
    public static void main(String[] args) {

        Duck duck = new Duck("Дональд Дак");
        Duck duck2 = new Duck("Гадкий");

        Fish fish = new Fish("Немо");
        Fish fish2 = new Fish("Дори");

        Horse horse = new Horse("Букингем");
        Horse horse2 = new Horse("Астон");

        Lion lion = new Lion("Муфасу");
        Lion lion2 = new Lion("Шрам");
        Lion lion3 = new Lion("Барсик");

        Panther panther = new Panther("Багира");
        Panther panther2 = new Panther("Балу");
        Panther panther3 = new Panther("Боб");

        Cow cow = new Cow("Буренка");
        Cow cow2 = new Cow("Милка");

        Food meat = new Meat("мясной рулет");
        Food grass = new Grass("свежая трава");

        Worker worker = new Worker();

        worker.getVoice(duck);
        duck.fly();
        duck.run();
        duck.swim();
        duck.swim();
        duck.swim();
        duck.swim();
        System.out.println(duck.voice());
        worker.feed(duck, meat);
        worker.feed(duck, grass);
        worker.getVoice(duck);
        System.out.println(duck.voice());
        duck.fly();
        duck.run();
        duck.swim();
        duck.fly();
        worker.feed(duck, grass);
        duck.run();
        duck.swim();

        System.out.println("---------------------------");

        worker.getVoice(lion);
        worker.feed(lion, grass);
        worker.getVoice(lion);
        worker.feed(lion, meat);
        worker.getVoice(lion);
        lion.run();
        worker.getVoice(lion);
        worker.getVoice(lion);
        worker.feed(lion, meat);
        worker.getVoice(lion);
        worker.getVoice(lion);
        worker.feed(lion, meat);

        System.out.println("---------------------------");

        worker.getVoice(cow);
        cow.run();
        cow.run();
        System.out.println(cow.voice());
        worker.feed(cow, meat);
        worker.feed(cow, grass);
        worker.getVoice(cow);
        System.out.println(cow.voice());
        cow.run();
        cow.run();
        worker.getVoice(cow);
        worker.getVoice(cow);
        worker.getVoice(cow);
        worker.feed(cow, grass);
        cow.run();
        worker.getVoice(cow);

        System.out.println("----------------------------");

        worker.getVoice(panther);
        worker.feed(panther, grass);
        worker.getVoice(panther);
        worker.feed(panther, meat);
        worker.getVoice(panther);
        panther.run();
        worker.getVoice(panther);
        worker.getVoice(panther);
        worker.feed(panther, meat);
        worker.getVoice(panther);
        worker.getVoice(panther);
        worker.feed(panther, meat);

        System.out.println("----------------------------");

        Swim[] pool = new Swim[2];
        pool[0] = fish;
        pool[1] = duck;

        for (int i = 0; i < pool.length; i++){
            pool[i].swim();
        }

        System.out.println("----------------------------");

        Aviary<Carnivorous> aviary = new Aviary<>(AviarySizeEnum.SMALL);
        aviary.addAnimal(lion);
        aviary.addAnimal(fish);

        Aviary<Herbivore> aviary2 = new Aviary<>(AviarySizeEnum.LARGE);
        aviary2.addAnimal(cow);
        aviary2.addAnimal(cow2);
        aviary2.addAnimal(duck);
        aviary2.addAnimal(duck2);
        aviary2.addAnimal(horse);
        aviary2.addAnimal(horse2);

        aviary2.getAnimal("Букингем");

        aviary2.getAllAnimals();

        System.out.println("----------------------------");

        Aviary<Carnivorous> aviary3 = new Aviary<>(AviarySizeEnum.XLARGE);
        aviary3.addAnimal(lion);
        aviary3.addAnimal(lion2);
        aviary3.addAnimal(lion3);
        aviary3.addAnimal(fish);
        aviary3.addAnimal(fish2);
        aviary3.addAnimal(panther);
        aviary3.addAnimal(panther2);
        aviary3.addAnimal(panther3);

        aviary3.getAllAnimals();

        aviary3.deleteAnimal("Барсик");
        aviary3.deleteAnimal("Боб");

        aviary3.getAllAnimals();

        aviary3.getAnimal("Муфасу");
    }
}