public class Mage extends PlayerCharacter implements Range {

    private int wisdom;

    public Mage(String newName) {
        name=newName;
        System.out.println("A mage named "+ name +" has been created!");

        strength= 7 + Die.roll();
        intelligence= 15 + Die.roll();
        agility= 8 + Die.roll();
        wisdom= 10 + Die.roll();

        hp = hpmax = strength;
        mp = mpmax = (intelligence + (2*wisdom));
    }

    public void showStats() {
        System.out.printf("%s (Mage) | Strength: %d | Intelligence: %d | Agility: %d | Wisdom: %d | Hit Points: %d / %d | Mana: %d / %d\n", name, strength, intelligence, agility, wisdom, hp, hpmax, mp, mpmax);
        //super.showStats();
        //System.out.printf("CHA: %3d\n",charisma);
    }

    public boolean lifeCheck() {
        if (hp > 0) lifeCheck = true;
        else lifeCheck = false;
        return lifeCheck;
    }

}
