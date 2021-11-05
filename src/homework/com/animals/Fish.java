package homework.com.animals;

import java.util.Objects;

public class Fish extends Carnivorous implements Swim {

    private String name;

    private AviarySizeEnum aviarySizeEnum = AviarySizeEnum.SMALL;

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        if (hunger <= 0) {
            System.out.println(getNameAnimal() + " ничего не делает, он хочет есть");
        } else {
            hunger--;
            System.out.println(getNameAnimal() + " плавает");
        }
    }

    @Override
    public String getNameAnimal() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AviarySizeEnum getAviarySizeEnum() {
        return aviarySizeEnum;
    }

    public void setAviarySizeEnum(AviarySizeEnum aviarySizeEnum) {
        this.aviarySizeEnum = aviarySizeEnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fish fish = (Fish) o;
        return Objects.equals(name, fish.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Рыба по имени: " + name;
    }
}