package com.progacademyoop.homework.homework2;

public class Main {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian ("Aibolit");

        Cat cat = new Cat("fish", "black", 3, "Tom");
        Dog dog = new Dog("meat", "brown", 12, "Spike");

        cat.eat();
        dog.sleep();
        veterinarian.treatment(cat);
        veterinarian.treatment(dog);
        System.out.println(cat.getVoice());
        System.out.println(dog.getVoice());

    }
}
