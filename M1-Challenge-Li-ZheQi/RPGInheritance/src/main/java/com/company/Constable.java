package com.company;

import java.util.Objects;

public class Constable extends Player{
    private String jurisdiction;

    //constructors

    public Constable(String name, String jurisdiction) {
        super(name, 60, 100, 60, 20, 5, false, false);
        this.jurisdiction = jurisdiction;
    }

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, String jurisdiction) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.jurisdiction = jurisdiction;
    }

    // attack another player
    @Override
    public void attack(Player player) {
        // damage health by farmer.attackPower() amount
        int originalHealth = player.getHealth();
//        player.setHealth(originalHealth - this.health);
        player.setHealth(originalHealth - this.attackPower);

    }

    // arrest another player
    public void arrest(Player player) {
        // player arrest value true
        player.setArrested(true);
    }

    //getters and setters
    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    //equals, hashCode, toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Constable constable = (Constable) o;
        return Objects.equals(jurisdiction, constable.jurisdiction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jurisdiction);
    }

    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction='" + jurisdiction + '\'' +
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
