package th_animal_interface;

public class Chicken extends Animal implements ImplementEdible {
    @Override
    public String makeSound() {
        return "chicken: chipchip";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }



}
