package homework.com.model;

public class Kotik {
    private int prettiness;
    private int weight;
    private String name;
    private String meow;
    private String foodName;

    private final int satiety = 5; // Сколько кот получит единиц сытости после еды.
    private int hunger = satiety; // Единица сытости
    private static int count;

    public Kotik(){
        count++;
    }

    public Kotik(int prettiness, int weight, String name, String meow, String foodName) {
        count++;
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.foodName = foodName;
    }

    public void setKotik(int prettiness, int weight, String name, String meow, String foodName){
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.foodName = foodName;
    }

    private boolean play(){
        if (hunger <= 0){
            System.out.println(name + " не играет, он хочет есть");
            eat(satiety);
        }
        System.out.println(name + " играет");
        hunger--;
        return true;
    }

    private boolean sleep(){
        if (hunger <= 0) {
            System.out.println(name + " не спит, он хочет есть!");
            eat(satiety, foodName);
        }
        System.out.println(name + " спит");
        hunger--;
        return true;
    }

    private boolean chaseMouse(){
        if (hunger <= 0) {
            System.out.println(name + " не гоняется за мышкой, он хочет есть!");
            eat();
        }
        System.out.println(name + " гоняется за мышкой");
        hunger--;
        return true;
    }

    private boolean sharpensClaws(){
        if (hunger <= 0) {
            System.out.println(name + " не точит когти, он хочет есть!");
            eat();
        }
        System.out.println(name + " точит когти");
        hunger--;
        return true;
    }

    private boolean sayMeow(){
        if (hunger <= 0) {
            System.out.println(name + " не мяукает, он хочет есть!");
            eat(satiety);
        }
        System.out.println(name + " говорит " + meow);
        hunger--;
        return true;
    }

    private int eat(int satiety){
        hunger += satiety;
        System.out.println(name + " поел!");
        return hunger;
    }

    private int eat(int satiety, String foodName){
        hunger += satiety;
        System.out.println(name + " поел " + foodName);
        return hunger;
    }

    private int eat() {
        return eat(satiety, foodName);
    }

    public void liveAnotherDay(){
        for (int i = 1; i <= 24; i++){
            int random = (int) (Math.random() * 5 + 1);
            switch (random) {
                case 1:
                    play();
                    break;
                case 2:
                    sleep();
                    break;
                case 3:
                    chaseMouse();
                    break;
                case 4:
                    sharpensClaws();
                    break;
                case 5:
                    sayMeow();
                    break;
            }
        }
    }

    public int getPrettiness() {
        return prettiness;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getMeow() {
        return meow;
    }

    public String getFoodName() {
        return foodName;
    }

    public static int getCount() {
        return count;
    }
}