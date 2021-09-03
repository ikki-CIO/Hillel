package org.introduction.heroes;

public class Archer extends Elf {
    private int bowStrength;

    public Archer(String sex, int strength, String name, boolean hasWeapon, int bowStrength) {
        super(sex, strength, name, hasWeapon);
        this.bowStrength = bowStrength;
    }

    @Override
    public void hit() {
        System.out.println("I hit with bow " + strength * bowStrength + " points.");
    }

    @Override
    public String toString() {
        return "Archer{" +
                "bowStrength=" + bowStrength +
                '}';
    }
}
