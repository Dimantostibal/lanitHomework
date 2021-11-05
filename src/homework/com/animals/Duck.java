package homework.com.animals;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice{

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        if (hunger <= 0){
            System.out.println(getName() + " ничего не делает, он хочет есть");
        } else {
            hunger --;
            System.out.println(getName() + " летит");
        }
    }

    @Override
    public void run() {
        if (hunger <= 0){
            System.out.println(getName() + " ничего не делает, он хочет есть");
        } else {
            hunger --;
            System.out.println(getName() + " бежит");
        }
    }

    @Override
    public void swim() {
        if (hunger <= 0){
            System.out.println(getName() + " ничего не делает, он хочет есть");
        } else {
            hunger --;
            System.out.println(getName() + " плавает");
        }
    }

    @Override
    public String voice() {
        if (hunger <= 0){
            return getName() + " ничего не делает, он хочет есть";
        } else {
            hunger --;
            return getName() + " говорит: Кря-кря";
        }
    }


    public String getNameAnimal() {
        return getName();
    }

    public void setName(String name) {
        this.name = name;
    }
}