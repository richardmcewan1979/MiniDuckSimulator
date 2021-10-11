package com.mcewanrichard;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehaviour = new Quack();
        attackBehaviour = new AttackNuns();
        flyBehaviour = new FlyWithWings();

    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
