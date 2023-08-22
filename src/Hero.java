public abstract class Hero implements HavingSuperAbility {
    private int hp;
    private int dmg;
    private String ultimateType;
    private String name;


    public Hero(int hp, int dmg, String ultimateType, String name) {
        this.hp = hp;
        this.dmg = dmg;
        this.ultimateType = ultimateType;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }

    public String getUltimateType() {
        return ultimateType;
    }

    public String getName() {
        return name;
    }
}
