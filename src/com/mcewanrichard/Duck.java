package com.mcewanrichard;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    AttackBehaviour attackBehaviour;

    public Duck(){
    }

    public abstract void display();

    public void performQuack(){
        quackBehaviour.quack();
    }
    public void performFly(){
        flyBehaviour.fly();
    }
    public void performAttack(){
        attackBehaviour.attack();
    }

    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }

    public void setAttackBehaviour(AttackBehaviour ab){
        attackBehaviour = ab;
    }



}
