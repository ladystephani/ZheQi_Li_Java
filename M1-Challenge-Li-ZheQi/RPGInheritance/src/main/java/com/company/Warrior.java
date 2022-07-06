package com.company;

import java.util.Objects;

public class Warrior extends Player {
//    private int shieldStrength = 100;
    private int shieldStrength;

    //constructors
    public Warrior(String name) {
        super(name, 75, 100, 100, 50, 10, false, false);

        this.shieldStrength = 100;
    }

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
    }

    //attack
    @Override
    public void attack(Player player) {
        // damage health by farmer.attackPower() amount
        int originalHealth = player.getHealth();
//        player.setHealth(originalHealth - this.health);
        player.setHealth(originalHealth - this.attackPower);

    }

    //getters and setters
    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    //methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Warrior warrior = (Warrior) o;
        return shieldStrength == warrior.shieldStrength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shieldStrength);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "shieldStrength=" + shieldStrength +
                ", name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", running=" + running +
                ", arrested=" + arrested +
                '}';
    }
}
