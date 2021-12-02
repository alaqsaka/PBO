public class Fighter extends Hero{
    String type = "Fighter";
    private int Hp = 3400;
    private int Atk = 170;
    private int Def = 100;

    public Fighter(String charName, int tipeChar, int addHp, int addAtk, int addDef) {
        super(charName, tipeChar, addHp, addAtk, addDef);
    }

    public int FinalHp = Hp + (addHp * 250); //adds 250
    public int FinalAtk = Atk + (addAtk * 15); //adds 15
    public int FinalDef = Def + (addDef * 20); //adds 20

    public int getHp() {
        return FinalHp;
    }
}
