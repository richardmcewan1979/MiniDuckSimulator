package com.mcewanrichard;

public class NoAttack implements AttackBehaviour{
    @Override
    public void attack() {
        System.out.println("No attack capability");
    }
}
