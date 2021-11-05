package homework.com;

import homework.com.model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik(999, 12, "Вася", "мяу-мяу", "мясо" );
        kotik1.liveAnotherDay();
        System.out.println("-----------------------------");
        Kotik kotik2 = new Kotik();
        kotik2.setKotik(888, 11, "Борис", "гав-гав", "сухой корм");
        kotik2.liveAnotherDay();
        int count = Kotik.getCount();

        System.out.println("-----------------------------");
        System.out.print("Котики одинакого мяукают? - ");
        System.out.println(kotik1.getMeow() == kotik2.getMeow()); // сравнение ссылок
        System.out.println("Котики одинакого мяукают? - " + kotik1.getMeow().equals(kotik2.getMeow())); // сравнение значений

        System.out.println("-----------------------------");
        System.out.println("Колличество котиков: " + count);
    }
}