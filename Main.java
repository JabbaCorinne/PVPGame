//methods, variables, etc. are all "members" of a class

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<PlayerCharacter> players= new ArrayList<PlayerCharacter>();

        //This is my tank
        players.add(new Fighter("Frank"));
        Fighter Frank = new Fighter("Frank");
        System.out.printf("There are currently %d players in the game.\n",players.size());

        //USER MUST CHOOSE 3 CHARACTERS (ONE OF EACH TYPE- T, R, H, SO EITHER PRIEST OR PALADIN MUST GO, UNLESS PALADIN IS PALADIN IS CASTED AS FIGHTER AND FIGHTER IS ELIMINATED (paladin=t, priest=h, mage=r)
        //players.add(new Priest("Pranav"));
        //Priest Pranav = new Priest("Pranav");
        //System.out.printf("There are currently %d players in the game.\n",players.size());

        //This is my range
        players.add(new Mage("Maggie"));
        Mage Maggie = new Mage("Maggie");
        System.out.printf("There are currently %d players in the game.\n",players.size());

        //This is my healer
        players.add(new Paladin("Pumpernickel"));
        Paladin Pumpernickel = new Paladin("Pumpernickel");
        System.out.printf("There are currently %d players in the game.\n",players.size());

        //FILL OUT BASED UPON ORDER SPECIFIED IN PARTY CLASS CONSTRUCTOR (here, the order is party name, fighter name, range name, healer name)
        Party user= new Party("Corinne", Frank, Maggie, Pumpernickel);

        ArrayList<Spell> spellBook= new ArrayList<Spell>();
        //insert values and spell name below
        spellBook.add(new Spell(10,17,20,15,true,"Freeze"));

        ArrayList<Weapon> armory= new ArrayList<Weapon>();
        //insert values and weapon name below
        armory.add(new Weapon(3,1, 6,false,"Dagger"));


        /// how to ask for an instance of an object is shown below
//        if(playerF1 instanceof Fighter) {
//            System.out.println("Player A is a fighter");
//        } else {
//            System.out.println("Player is not a fighter");
//        }

        for (PlayerCharacter x: players) {
            if (x instanceof Fighter|| x instanceof Priest ||x instanceof Paladin|| x instanceof Mage) {
                System.out.println();
                x.showStats();
            }
        }

        //playerF1.constitution= 1000000;
            // now that constitution is private, this doesn't work, which is intentional

        //PlayerCharacter playerX= new PlayerCharacter();
            // don't want to be able to use this


    }
}
