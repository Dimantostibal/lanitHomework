package homework.com.animals;

import java.util.HashMap;
import java.util.Map;

public class Aviary<T extends Animal> {

    private T animal;
    private Map<String, T> animalHashMap = new HashMap<>();
    private AviarySizeEnum aviarySizeEnum;

    public Aviary(AviarySizeEnum aviarySizeEnum) {
        this.aviarySizeEnum = aviarySizeEnum;
    }

    public void addAnimal(T animal){
        if (aviarySizeEnum.equals(animal.getAviarySizeEnum())) {
            animalHashMap.put(animal.getNameAnimal(), animal);
            System.out.println(animal.getNameAnimal() + " добавлен в вольер");
        } else {
            System.out.println("Не подходящий вольер для " + animal.getNameAnimal());
        }
    }

    public Animal getAnimal(String animalName) {
        System.out.println(animalHashMap.get(animalName));
        return animalHashMap.get(animalName);
    }

    public void deleteAnimal(String animalName){
        animalHashMap.remove(animalName);
        System.out.println(animalName + " удален из вольера");
    }

    public void getAllAnimals(){
        System.out.println("Сейчас в вольере " + animalHashMap.values());
    }
}