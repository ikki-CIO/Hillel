package org.introduction.heroes;

public class SwordMan extends Elf {
    private int swordStrength;
    private int mail;

    public SwordMan(String sex, int strength, int basicArmor, String race, String name, boolean hasWeapon, boolean hasArmor, int canFly, int canSwim, int swordStrength, int mail) {
        super(sex, strength, basicArmor, race, name, hasWeapon, hasArmor, canFly, canSwim);
        this.swordStrength = swordStrength;
        this.mail = mail;
    }

    @Override
    public void attack() {
        System.out.println("The force of my blow is equal to: " + strength + "\n" +
                "I have an additional weapon in the form of a sword, so the total damage is equal to " + strength * swordStrength + " points.");
    }

    @Override
    public void defence() {
        System.out.println("My base defense is " + basicArmor + " points.\n" +
                "I have additional protection in the form of chain mail, so the total protection is equal to " + basicArmor * mail + " points.");
    }

    @Override
    public void hit() {
        System.out.println("I  hit with sword " + strength * swordStrength + " points.");

    }

    @Override
    public String toString() {
        return "SwordMan{" +
                "swordStrength=" + swordStrength +
                ", mail=" + mail +
                ", strength=" + strength +
                ", basicArmor=" + basicArmor +
                ", name='" + name + '\'' +
                ", hasWeapon=" + hasWeapon +
                ", hasArmor=" + hasArmor +
                '}';
    }

    @Override
    public void fly() {
        System.out.println("I am " + name + " I can't fly!");
    }

    @Override
    public void swim() {
        System.out.println("I am " + name + " I can swim!");
    }
}
