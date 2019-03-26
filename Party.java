public class Party {
    protected Tank tank;
    protected Range range;
    protected Healer healer;
    //protected TankHealer tankHealer;
    public String teamName;
    //protected boolean full;
    protected boolean check;
    
    
    //IN-CLASS SUGGESTIONS FOR HOW TO CODE THIS
//     public Party(){
//     }
  

    //ORDER CAN BE REARRANGED, BUT YOU ALWAYS NEED ONE OF EACH TYPE (t, r, and h)
    Party(String teamName, Tank t, Range r, Healer h) {
        tank = t;
        range = r;
        healer = h;
        //tankHealer = th;
    }

    public boolean check(PlayerCharacter pc) {
        if (pc.lifeCheck()) check = true;
        else check = false;
        return check;
    }

}

