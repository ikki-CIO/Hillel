package org.introduction.heroes;

public class Dwarf extends Warrior {
    private int hammer;
    private int shield;

    public Dwarf(String sex, int strength, int basicArmor, String race, String name, boolean hasWeapon, boolean hasArmor, int hammer, int shield) {
        super(sex, strength, basicArmor, race, name, hasWeapon, hasArmor);
        this.hammer = hammer;
        this.shield = shield;
    }

    public int getHammer() {
        return hammer;
    }

    public void setHammer(int hammer) {
        this.hammer = hammer;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    @Override
    public void sayGreeting() {
        System.out.println("Hello! I'm  " + name);
    }

    @Override
    public void attack() {
        System.out.println("The force of my blow is equal to: " + strength + "\n" +
                "I have an additional weapon in the form of a hammer, so the total damage is equal to " + strength * hammer + " points.");
    }

    @Override
    public void defence() {
        System.out.println("My base defense is " + basicArmor + " points.\n" +
                "I have additional protection in the form of chain shield, so the total protection is equal to " + basicArmor * shield + " points.");

    }

    @Override
    public String toString() {
        return "Dwarf{" +
                "hammer=" + hammer +
                ", shield=" + shield +
                '}';
    }
}
