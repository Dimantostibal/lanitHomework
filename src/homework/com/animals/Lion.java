package homework.com.animals;

import java.util.Objects;

public class Lion extends Carnivorous implements Run, Voice{

    private String name;
    private AviarySizeEnum aviarySizeEnum = AviarySizeEnum.XLARGE;

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        if (hunger <= 0){
            System.out.println(getNameAnimal() + " ничего не делает, он хочет есть");
        } else {
            hunger --;
            System.out.println(getNameAnimal() + " бежит");
        }
    }

    @Override
    public String voice() {
        if (hunger <= 0){
            return getNameAnimal() + " ничего не делает, он хочет есть";
        } else {
            hunger --;
            return getNameAnimal() + " говорит: Ррррр";
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
        Lion lion = (Lion) o;
        return Objects.equals(name, lion.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Лев по имени: " + name;
    }
}