package homework.com.animals;

import java.util.Objects;

public class Cow extends Herbivore implements Run, Voice{

    private String name;
    private AviarySizeEnum aviarySizeEnum = AviarySizeEnum.MEDIUM;

    public Cow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        if (hunger <= 0){
            System.out.println(getNameAnimal() + " ничего не делает, она хочет есть");
        } else {
            hunger --;
            System.out.println(getNameAnimal() + " бегает");
        }
    }

    @Override
    public String voice() {
        if (hunger <= 0){
            return getNameAnimal() + " ничего не делает, она хочет есть";
        } else {
            hunger --;
            return getNameAnimal() + " говорит: Муууу";
        }
    }

    @Override
    public String getNameAnimal() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public AviarySizeEnum getAviarySizeEnum() {
        return aviarySizeEnum;
    }

    @Override
    public void setAviarySizeEnum(AviarySizeEnum aviarySizeEnum) {
        this.aviarySizeEnum = aviarySizeEnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cow cow = (Cow) o;
        return Objects.equals(name, cow.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Корова по имени: " + name;
    }
}