package com.mcewanrichard;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.performAttack();

        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
        model.performAttack();

    }
}
