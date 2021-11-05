package homework.com.animals;

import java.util.Objects;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {

    private String name;

    private AviarySizeEnum aviarySizeEnum = AviarySizeEnum.SMALL;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        if (hunger <= 0) {
            System.out.println(getNameAnimal() + " ничего не делает, он хочет есть");
        } else {
            hunger--;
            System.out.println(getNameAnimal() + " летит");
        }
    }

    @Override
    public void run() {
        if (hunger <= 0) {
            System.out.println(getNameAnimal() + " ничего не делает, он хочет есть");
        } else {
            hunger--;
            System.out.println(getNameAnimal() + " бежит");
        }
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
    public String voice() {
        if (hunger <= 0) {
            return getNameAnimal() + " ничего не делает, он хочет есть";
        } else {
            hunger--;
            return getNameAnimal() + " говорит: Кря-кря";
        }
    }

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
        Duck duck = (Duck) o;
        return Objects.equals(name, duck.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Утка по имени: " + name;
    }
}