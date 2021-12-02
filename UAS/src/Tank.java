public class Tank extends Hero{
    String type = "Tank";
    private int Hp = 4000;
    private int Atk = 150;
    private int Def = 150;

    public Tank(String charName, int tipeChar, int addHp, int addAtk, int addDef) {
        super(charName, tipeChar, addHp, addAtk, addDef);
    }

    public int FinalHp = Hp + (addHp * 340); //adds 340
    public int FinalAtk = Atk + (addAtk * 10); //adds 10
    public int FinalDef = Def + (addDef * 25); //adds 25

    public int getHp() {
        return FinalHp;
    }

}
