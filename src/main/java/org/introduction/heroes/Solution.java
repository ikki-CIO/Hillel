package org.introduction.heroes;

public class Solution {

    private Elf[] elvesArray = new Elf[10];

    public static void main(String[] args) {

        Elf firstElf = new Elf("male", 10, "firstElf", false);
        Elf secondElf = new Elf("female", 10, "secondElf", false);

        Elf firstArcher = new Archer("female", 10, "firstArcher", true, 30);
        Elf secondArcher = new Archer("male", 10, "secondArcher", true, 32);
        Elf thirdArcher = new Archer("female", 10, "thirdArcher", true, 24);

        Elf firstSwordsMan = new SwordMan("male", 10, "firstSwordsman", true, 43);
        Elf secondSwordsMan = new SwordMan("male", 10, "secondSwordsman", true, 45);
        Elf thirdSwordsMan = new SwordMan("male", 10, "thirdSwordsman", true, 35);
        Elf forthSwordsMan = new SwordMan("female", 10, "forthSwordsman", true, 53);
        Elf fifthSwordsMan = new SwordMan("male", 10, "fifthSwordsman", true, 65);

        Solution solution = new Solution();
        solution.setElves(firstElf, secondElf, firstArcher, secondArcher, thirdArcher, firstSwordsMan, secondSwordsMan, thirdSwordsMan,
                forthSwordsMan, fifthSwordsMan);

        for (Elf elfElement : solution.elvesArray) {
            elfElement.sayGreeting();
            elfElement.hit();
            System.out.println();
        }

    }

    private void setElves(Elf... elves) {
        for (int i = 0; i < elves.length; i++) {
            elvesArray[i] = elves[i];

        }
    }
}
