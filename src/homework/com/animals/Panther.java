package homework.com.animals;

public class Panther extends Carnivorous implements Run, Voice{

    public Panther(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        if (hunger <= 0){
            System.out.println(getName() + " ничего не делает, он хочет есть");
        } else {
            hunger --;
            System.out.println(getName() + " бегает");
        }
    }

    @Override
    public String voice() {
        if (hunger <= 0){
            return getName() + " ничего не делает, он хочет есть";
        } else {
            hunger --;
            return getName() + " говорит: Ррр-ррр";
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