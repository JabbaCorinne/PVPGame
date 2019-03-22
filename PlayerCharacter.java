//abstract class used to extend but not instantiate
public abstract class PlayerCharacter {

    //"protected" prevents anyone from having external access, but anything that extends from it does have access
        //"final" breaks protection chain
    protected String name;

    protected int strength;
    protected int intelligence;
    protected int agility;

    protected int hp, hpmax;
    protected int mp, mpmax;

    private static int count;
    //applies to everything that extends from PlayerCharacter

    public boolean lifeCheck;

    public PlayerCharacter() {
    //System.out.println("PlayerCharacter extended class created.\n");
        System.out.println();
    count++;
    }

    protected void showStats() {
       //System.out.printf(" HP: %3d/%3d\n", hp, hpmax);
       //System.out.printf(" MP: %3d/%3d\n", mp, mpmax);
       //System.out.printf("STR: %3d\nINT: %3d\nAGI: %3d\n",strength,intelligence,agility);
       //more logical to do within each character class
    }

    public boolean lifeCheck() {
       if (hp>0) lifeCheck=true;
       else lifeCheck=false;
       return lifeCheck;
    }

    public static int numCharacters() {
        return count;
    }
}
