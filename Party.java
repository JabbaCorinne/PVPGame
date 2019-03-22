public class Party {
    protected Tank tank;
    protected Range range;
    protected Healer healer;
    //protected TankHealer tankHealer;
    public String teamName;
    //protected boolean full;
    protected boolean check;

    //UPDATE ACCORDING TO THE CHARACTERS SELECTED
    Party(String teamName, Tank t, Healer h, Range r) {
        tank = t;
        healer = h;
        range = r;
        //tankHealer = th;
    }

    public boolean check(PlayerCharacter pc) {
        if (pc.lifeCheck()) check = true;
        else check = false;
        return check;
    }

}

