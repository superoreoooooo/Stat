package win.oreo.stat.stat;

public class Stat {
    private int STR;
    private int DEX;
    private int LUK;
    private int INT;
    private int HP;
    private int MP;
    private int LVL;
    private double EXP;
    private double ATK;
    private double DEF;

    public Stat(int STR, int DEX, int LUK, int INT, int HP, int MP, int LVL, double EXP, double ATK, double DEF) {
        this.STR = STR;
        this.DEX = DEX;
        this.LUK = LUK;
        this.INT = INT;
        this.HP = HP;
        this.MP = MP;
        this.LVL = LVL;
        this.EXP = EXP;
        this.ATK = ATK;
        this.DEF = DEF;
    }

    public int getSTR() {
        return STR;
    }

    public void setSTR(int STR) {
        this.STR = STR;
    }

    public int getDEX() {
        return DEX;
    }

    public void setDEX(int DEX) {
        this.DEX = DEX;
    }

    public int getLUK() {
        return LUK;
    }

    public void setLUK(int LUK) {
        this.LUK = LUK;
    }

    public int getINT() {
        return INT;
    }

    public void setINT(int INT) {
        this.INT = INT;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getLVL() {
        return LVL;
    }

    public void setLVL(int LVL) {
        this.LVL = LVL;
    }

    public double getEXP() {
        return EXP;
    }

    private void setEXP(double EXP) {
        this.EXP = EXP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public double getATK() {
        return ATK;
    }

    public void setATK(double ATK) {
        this.ATK = ATK;
    }

    public double getDEF() {
        return DEF;
    }

    public void setDEF(double DEF) {
        this.DEF = DEF;
    }
}
