public class Magic extends Hero {

    public Magic(int hp, int dmg, String ultimateType, String name) {
        super(hp, dmg, ultimateType, name);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность ICE CASTLE");
    }
}
