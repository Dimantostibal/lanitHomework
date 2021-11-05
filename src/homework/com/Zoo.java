package homework.com;

import homework.com.animals.*;
import homework.com.food.*;
import homework.com.worker.Worker;

public class Zoo {
    public static void main(String[] args) {

        Duck duck = new Duck("Дональд Дак");
        Fish fish = new Fish("Немо");
        Horse horse = new Horse("Букингем");
        Lion lion = new Lion("Муфасу");
        Panther panther = new Panther("Багира");
        Cow cow = new Cow("Буренка");

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
    }
}