package org.introduction.heroes;

public class Elf extends Warrior {
    private int height;
    private int age;

    public Elf(String sex, int strength, int basicArmor, String race, String name, boolean hasWeapon, boolean hasArmor,
               int canFly, int canSwim) {
        super(sex, strength, basicArmor, race, name, hasWeapon, hasArmor, canFly, canSwim);

    }

    public void eat() {
        System.out.println("I am eating!");
    }

    public void run() {
        System.out.println("I can run!");

    }

    public void hit() {
        System.out.println("I hit with " + strength + " points");

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public void sayGreeting() {
        System.out.println("Hello! I'm  " + name);
    }

    @Override
    public void attack() {
        System.out.println("The force of my blow is equal to: " + strength + " points.\n" +
                "I do not have an additional weapon, respectively, the force of the blow is the same " + strength + " points.");
    }

    @Override
    public void defence() {
        System.out.println("My base defense is " + basicArmor + " points.\n" +
                "I have no additional protection, so the total armor is the same " + basicArmor + " points.");

    }

    @Override
    public String toString() {
        return "Elf{" +
                "height=" + height +
                ", age=" + age +
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
        System.out.println("I am" + name + " I can swim!");
    }
}
