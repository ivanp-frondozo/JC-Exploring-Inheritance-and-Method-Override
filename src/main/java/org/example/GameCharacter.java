package org.example;

public class GameCharacter {
    public int health;
    private String characterType = "Regular character";

    public GameCharacter(int health) {
        this.health = health;
    }

    public int takeDamage(int amount) {
        health -= amount;
        return health;
    }

    public void displayDamage(int amount) {
        System.out.println(characterType + " takes " + amount + " damage. New health: " + health);
    }
}

class ArmoredCharacter extends GameCharacter {
    private String characterType = "Armored character";

    public ArmoredCharacter(int health) {
        super(health);
    }

    @Override
    public int takeDamage(int amount) {
        int armoredDamage = amount/2;
        return super.takeDamage(armoredDamage);
    }

    @Override
    public void displayDamage(int amount) {
        System.out.println(characterType + " takes " + (amount / 2) + " damage. New health: " + health);
    }
}
