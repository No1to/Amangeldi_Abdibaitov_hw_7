public class Warrior extends Hero {
    public Warrior(int hp, int dmg, String ultimateType, String name) {
        super(hp, dmg, ultimateType, name);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность BANKAI");
    }
}
