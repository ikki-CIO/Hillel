package org.introduction.heroes;

public class Elf {
    private int height;
    private int age;
    private String sex;
    protected int strength;

    private String name;

    protected boolean hasWeapon;

    public Elf(String sex, int strength, String name, boolean hasWeapon) {
        this.strength = strength;
        this.sex = sex;
        this.name = name;
        this.hasWeapon = hasWeapon;
    }

    public boolean isHasWeapon() {
        return hasWeapon;
    }

    public void setHasWeapon(boolean hasWeapon) {
        this.hasWeapon = hasWeapon;
    }

    public void eat() {

    }

    public void run() {

    }

    public void hit() {
        System.out.println("I hit with " + strength + " points");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void sayGreeting() {
        System.out.println("Hello! I'm  " + name);
    }

    @Override
    public String toString() {
        return "Elf{" +
                "height=" + height +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", strength=" + strength +
                ", name='" + name + '\'' +
                ", hasWeapon=" + hasWeapon +
                '}';
    }
}
