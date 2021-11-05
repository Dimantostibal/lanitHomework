package homework.com.animals;

public class Fish extends Carnivorous implements Swim{

    public Fish(String name) {
        this.name = name;
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
    public String getNameAnimal() {
        return getName();
    }

    public void setName(String name) {
        this.name = name;
    }
}