public class Fighter extends PlayerCharacter implements Tank {

    //private means only instances of the class have access
    private int constitution;

    public Fighter(String newName) {
        name = newName;
        System.out.println("A fighter named " + name + " has been created!");

        strength = 15 + Die.roll();
        intelligence = 7 + Die.roll();
        agility = 8 + Die.roll();
        constitution = 10 + Die.roll();

        hp = hpmax = (strength * 2) + (constitution * 2);
        mp = mpmax = 0;
    }

    public void showStats() {
        System.out.printf("%s (Fighter) | Strength: %d | Intelligence: %d | Agility: %d | Constitution: %d | Hit Points: %d / %d | Mana: %d / %d\n", name, strength, intelligence, agility, constitution, hp, hpmax, mp, mpmax);
        //super.showStats();
        //System.out.printf("CON: %3d\n",constitution);
    }

    public boolean lifeCheck() {
        if (hp > 0) lifeCheck = true;
        else lifeCheck = false;
        return lifeCheck;
    }

}
