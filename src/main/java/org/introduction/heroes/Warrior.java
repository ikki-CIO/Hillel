package org.introduction.heroes;

public abstract class Warrior {
    private String sex;
    protected int strength;
    protected int basicArmor;

    private String race;
    protected String name;

    protected boolean hasWeapon;
    protected boolean hasArmor;

    public Warrior(String sex, int strength, int basicArmor, String race, String name, boolean hasWeapon, boolean hasArmor) {
        this.sex = sex;
        this.strength = strength;
        this.basicArmor = basicArmor;
        this.race = race;
        this.name = name;
        this.hasWeapon = hasWeapon;
        this.hasArmor = hasArmor;
    }

    public boolean isHasArmor() {
        return hasArmor;
    }

    public void setHasArmor(boolean hasArmor) {
        this.hasArmor = hasArmor;
    }

    public int getBasicArmor() {
        return basicArmor;
    }

    public void setBasicArmor(int basicArmor) {
        this.basicArmor = basicArmor;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasWeapon() {
        return hasWeapon;
    }

    public void setHasWeapon(boolean hasWeapon) {
        this.hasWeapon = hasWeapon;
    }

    public abstract void sayGreeting();

    public abstract void attack();

    public abstract void defence();

    @Override
    public String toString() {
        return "Warrior{" +
                "sex='" + sex + '\'' +
                ", strength=" + strength +
                ", basicArmor=" + basicArmor +
                ", race='" + race + '\'' +
                ", name='" + name + '\'' +
                ", hasWeapon=" + hasWeapon +
                ", hasArmor=" + hasArmor +
                '}';
    }
}