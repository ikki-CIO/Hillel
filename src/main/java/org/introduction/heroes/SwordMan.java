package org.introduction.heroes;

public class SwordMan extends Elf {
    private int swordStrength;

    public SwordMan(String sex, int strength, String name, boolean hasWeapon, int swordStrength) {
        super(sex, strength, name, hasWeapon);
        this.swordStrength = swordStrength;
    }

    @Override
    public void hit() {
        System.out.println("I  hit with sword " + strength * swordStrength + " points.");
    }

    @Override
    public String toString() {
        return "SwordMan{" +
                "swordStrength=" + swordStrength +
                '}';
    }
}
