public class Priest extends PlayerCharacter implements Healer{

    private int charisma;

    public Priest(String newName) {
        name=newName;
        System.out.println("A priest named "+ name +" has been created!");

        strength= 7 + Die.roll();
        intelligence= 15 + Die.roll();
        agility= 8 + Die.roll();
        charisma= 10 + Die.roll();

        hp = hpmax = strength;
        mp = mpmax = (intelligence + (2*charisma));
    }

    public void showStats() {
        System.out.printf("%s (Priest) | Strength: %d | Intelligence: %d | Agility: %d | Charisma: %d | Hit Points: %d / %d | Mana: %d / %d\n", name, strength, intelligence, agility, charisma, hp, hpmax, mp, mpmax);
        //super.showStats();
        //System.out.printf("CHA: %3d\n",charisma);
    }

    public boolean lifeCheck() {
        if (hp > 0) lifeCheck = true;
        else lifeCheck = false;
        return lifeCheck;
    }

}
