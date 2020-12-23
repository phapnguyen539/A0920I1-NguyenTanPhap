package th_animal_interface;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals= new Animal[2];
        animals[0]= new Tiger();
        animals[1]=new Chicken();
        for (Animal animal: animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                ImplementEdible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
