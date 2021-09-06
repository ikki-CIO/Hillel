package org.introduction.heroes;

public class Archer extends Elf {
    private int bowStrength;

    public Archer(String sex, int strength, int basicArmor, String race, String name, boolean hasWeapon, boolean hasArmor, int canFly, int canSwim, int bowStrength) {
        super(sex, strength, basicArmor, race, name, hasWeapon, hasArmor, canFly, canSwim);
        this.bowStrength = bowStrength;
    }

    @Override
    public void hit() {
        System.out.println("I hit with bow " + strength * bowStrength + " points.");
    }

    @Override
    public void attack() {
        System.out.println("The force of my blow is equal to: " + strength + "\n" +
                "I have an additional weapon in the form of a bow, so the total damage is equal to " + strength * bowStrength + " points.");
    }

    @Override
    public void defence() {
        super.defence();
    }

    @Override
    public String toString() {
        return "Archer{" +
                "bowStrength=" + bowStrength +
                ", strength=" + strength +
                ", basicArmor=" + basicArmor +
                ", name='" + name + '\'' +
                ", hasWeapon=" + hasWeapon +
                ", hasArmor=" + hasArmor +
                '}';
    }

    @Override
    public void fly() {
        System.out.println("I am " + name + " I can fly!");
    }

    @Override
    public void swim() {
        System.out.println("I am " + name + "  I can't swim!");
    }
}
