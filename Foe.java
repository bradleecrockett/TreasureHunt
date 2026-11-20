public class Foe extends Entity {
    
    private int strength;
    
    public Foe (String n, int s) {
        super(n);
        strength = s;
    }
    
    public int computeBattleNumber() {
        //needs more intersting battle calculation
        return 5;
    }
}
