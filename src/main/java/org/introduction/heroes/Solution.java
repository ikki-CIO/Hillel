package org.introduction.heroes;

public class Solution {

    private static Warrior[] warriorsArray = new Warrior[12];
    private Elf[] elvesArray = new Elf[10];

    public static void main(String[] args) {

        Elf firstElf = new Elf("female", 10, 5, "elf", "firstElf", false, false);
        Elf secondElf = new Elf("female", 10, 5, "elf", "secondElf", false, false);

        warriorsArray[0] = firstElf;
        warriorsArray[1] = secondElf;

        Archer firstArcher = new Archer("female", 10, 5, "elf", "firstArcher", true, false, 30);
        Archer secondArcher = new Archer("male", 10, 5, "elf", "secondArcher", true, false, 33);
        Archer thirdArcher = new Archer("female", 10, 5, "elf", "thirdArcher", true, false, 39);

        warriorsArray[2] = firstArcher;
        warriorsArray[3] = secondArcher;
        warriorsArray[4] = thirdArcher;

        SwordMan firstSwordsMan = new SwordMan("female", 10, 5, "elf", "firstArcher", true, true, 30, 20);
        SwordMan secondSwordsMan = new SwordMan("male", 10, 5, "elf", "secondSwordsMan", true, true, 33, 15);
        SwordMan thirdSwordsMan = new SwordMan("female", 10, 5, "elf", "thirdSwordsMan", true, true, 45, 10);
        SwordMan forthSwordsMan = new SwordMan("male", 10, 5, "elf", "forthSwordsMan", true, true, 40, 12);
        SwordMan fifthSwordsMan = new SwordMan("female", 10, 5, "elf", "fifthSwordsMan", true, true, 55, 5);

        warriorsArray[5] = firstSwordsMan;
        warriorsArray[6] = secondSwordsMan;
        warriorsArray[7] = thirdSwordsMan;
        warriorsArray[8] = forthSwordsMan;
        warriorsArray[9] = fifthSwordsMan;

        Dwarf firstDwarf = new Dwarf("female", 10, 30, "dwarf", "firstDwarf", true, true, 25, 40);
        Dwarf secondDwarf = new Dwarf("male", 10, 30, "dwarf", "secondDwarf", true, true, 20, 45);

        warriorsArray[10] = firstDwarf;
        warriorsArray[11] = secondDwarf;

        Solution solution = new Solution();
        solution.setElves(firstElf, secondElf, firstArcher, secondArcher, thirdArcher, firstSwordsMan, secondSwordsMan, thirdSwordsMan,
                forthSwordsMan, fifthSwordsMan);

        for (Elf elfElement : solution.elvesArray) {
            elfElement.sayGreeting();
            elfElement.hit();
            System.out.println();
        }

        for (Warrior element : warriorsArray) {
            element.sayGreeting();
            element.attack();
            element.defence();
            System.out.println();
        }

    }

    private void setElves(Elf... elves) {
        for (int i = 0; i < elves.length; i++) {
            elvesArray[i] = elves[i];

        }
    }
}
