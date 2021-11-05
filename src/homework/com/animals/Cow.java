package homework.com.animals;

public class Cow extends Herbivore implements Run, Voice{

    public Cow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        if (hunger <= 0){
            System.out.println(getName() + " ничего не делает, она хочет есть");
        } else {
            hunger --;
            System.out.println(getName() + " бегает");
        }
    }

    @Override
    public String voice() {
        if (hunger <= 0){
            return getName() + " ничего не делает, она хочет есть";
        } else {
            hunger --;
            return getName() + " говорит: Муууу";
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