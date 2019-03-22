public class Party {
    protected Tank tank;
    protected Range range;
    protected Healer healer;
    protected TankHealer tankHealer;
    public String teamName;
    //protected boolean full;
    protected boolean check;

    Party(String teamName, Tank t, Healer h, Range r, TankHealer th) {
        tank = t;
        healer = h;
        range = r;
        tankHealer = th;
    }

    public boolean check(PlayerCharacter pc) {
        if (pc.lifeCheck()) check = true;
        else check = false;
        return check;
    }

}

