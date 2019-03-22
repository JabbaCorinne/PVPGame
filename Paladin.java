public class Paladin extends PlayerCharacter implements Tank, Healer {

   private int wisdom;
   private int constitution;

    public Paladin(String newName) {
        name=newName;
        System.out.println("A paladin named "+ name +" has been created!");

        strength= 10 + Die.roll();
        intelligence= 15 + Die.roll();
        agility= 5 + Die.roll();
        wisdom= 10 + Die.roll();
        constitution= 10 + Die.roll();

        hp = hpmax = (strength + (2*constitution));
        mp = mpmax = (intelligence + (2*wisdom));
    }

    public void showStats() {
        System.out.printf("%s (Paladin) | Strength: %d | Intelligence: %d | Agility: %d | Wisdom: %d | Constitution: %d | Hit Points: %d / %d | Mana: %d / %d\n", name, strength, intelligence, agility, wisdom, constitution, hp, hpmax, mp, mpmax);
        //super.showStats();
        //System.out.printf("CON: %3d\n",constitution);
    }

    public boolean lifeCheck() {
        if (hp > 0) lifeCheck = true;
        else lifeCheck = false;
        return lifeCheck;
    }

}
