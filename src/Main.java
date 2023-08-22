public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic(200, 20, "ICE CASTLE", "Wizzard");
        heroes[1] = new Medic(2000, 200, "DIVINE BLESSING", "Keyaru", -20);
        heroes[2] = new Warrior(2000, 2000, "BANKAI", "Ichigo");

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }
}