package ss7_abstract_class_and_interface.practice.practice1.animal;

import ss7_abstract_class_and_interface.practice.practice1.edible.Edible;
import ss7_abstract_class_and_interface.practice.practice1.fruit.*;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        System.out.println("\nUse Interface to implement 'howToEat' fruits");
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
