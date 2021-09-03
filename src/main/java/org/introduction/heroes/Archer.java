package org.introduction.heroes;

public class Archer extends Elf {
    private int bowStrength;

    public Archer(String sex, int strength, int basicArmor, String race, String name, boolean hasWeapon, boolean hasArmor, int bowStrength) {
        super(sex, strength, basicArmor, race, name, hasWeapon, hasArmor);
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
                '}';
    }
}
