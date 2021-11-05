package homework.com.animals;

public class Lion extends Carnivorous implements Run, Voice{

    public Lion(String name) {
        this.name = name;
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
    public String voice() {
        if (hunger <= 0){
            return getName() + " ничего не делает, он хочет есть";
        } else {
            hunger --;
            return getName() + " говорит: Ррррр";
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