public class Medic extends Hero {
    private int healPoints;

    public Medic(int hp, int dmg, String ultimateType, String name, int healPoints) {
        super(hp, dmg, ultimateType, name);
        this.healPoints = healPoints;
    }


    public void increaseExperience() {
        healPoints = (int) (healPoints * 1.1);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность DIVINE BLESSING");
    }
}
