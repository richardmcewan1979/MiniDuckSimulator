package com.mcewanrichard;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
        attackBehaviour = new NoAttack();
    }

    public void display() {
        System.out.println("I'm a model Duck");
    }
}
