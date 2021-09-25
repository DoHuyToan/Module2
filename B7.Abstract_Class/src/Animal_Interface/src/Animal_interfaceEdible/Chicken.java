package Animal_interfaceEdible;

import Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cuuk - cuuk";
    }

    @Override
    public String howtoEat() {
        return "Có thể chiên ròn";
    }
}
