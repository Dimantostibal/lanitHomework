package homework.com.animals;

import java.util.Objects;

public class Panther extends Carnivorous implements Run, Voice{

    private String name;
    private AviarySizeEnum aviarySizeEnum = AviarySizeEnum.XLARGE;

    public Panther(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        if (hunger <= 0){
            System.out.println(getNameAnimal() + " ничего не делает, он хочет есть");
        } else {
            hunger --;
            System.out.println(getNameAnimal() + " бегает");
        }
    }

    @Override
    public String voice() {
        if (hunger <= 0){
            return getNameAnimal() + " ничего не делает, он хочет есть";
        } else {
            hunger --;
            return getNameAnimal() + " говорит: Ррр-ррр";
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
        Panther panther = (Panther) o;
        return Objects.equals(name, panther.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Пантера по имени: " + name;
    }
}