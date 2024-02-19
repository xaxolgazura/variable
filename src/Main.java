package ru.skyeng;

public class Main {

    public static void main(String[] args) {
        var box = 5;
        System.out.println (box);
        box = box + 2;
        System.out.println (box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println ("Еще можно положить " + capacityLeft  + " кг вещей");
        var appaleWeight = 2;
        var orengesWeight = 3;
        var fruitWeight = appaleWeight + orengesWeight;
        System.out.println("Объщий вес фруктов " + fruitWeight);

        var meatWeight  = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight +  waterWeight;
        System.out.println("Общий вес продиктов " + productsWeight + " кг!" );

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Место осталось " + leftWeight + " кг!" );

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " + productsWeight);

        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Теперь место осталось " + leftWeight + " кг!");

        var overload = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на " + overload + " кг! ");

        var productsInoneCar = productsWeight / 2;
        System.out.println("Продукты в одной машине теперь " + productsInoneCar);


    }
}