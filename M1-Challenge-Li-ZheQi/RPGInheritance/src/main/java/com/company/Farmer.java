package com.company;

import java.util.Objects;

public class Farmer extends Player {


    //add two extra characteristics
    private boolean plowing;
    private boolean harvesting;

    //constructors

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, boolean plowing, boolean harvesting) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.plowing = plowing;
        this.harvesting = harvesting;
    }

    public Farmer(String name, boolean plowing, boolean harvesting) {
        //method1
//        this.name=name;
//        strength = 75;
//        health = 100;
//        stamina = 75;
//        speed = 10;
//        attackPower = 1;
//        running = false;
//        arrested = false;
        //method2
        super(name, 75, 100, 75, 10, 1, false, false);

        this.plowing = false;
        this.harvesting = false;
    }

    // attack another player
    @Override
    public void attack(Player player) {
        // damage health by farmer.attackPower() amount
        int originalHealth = player.getHealth();
//        player.setHealth(originalHealth - this.health);
        player.setHealth(originalHealth - this.attackPower);

    }

    //getters and setters

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }


    //equals, hashCode, toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Farmer farmer = (Farmer) o;
        return plowing == farmer.plowing && harvesting == farmer.harvesting;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plowing, harvesting);
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "plowing=" + plowing +
                ", harvesting=" + harvesting +
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
