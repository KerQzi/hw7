public class Main {
    public static void main(String[] args) {

        HavingSuperAbility[] havingSuperAbilitiesHeroes = {
                new Magic(150, 25, "FIRE BALL"),
                new Medic(100,0, "HEALING"),
                new Warrior(200, 20, "CRITICAL DAMAGE")
        };

        for (HavingSuperAbility abil : havingSuperAbilitiesHeroes) {
            abil.applySuperAbility();
            if (abil instanceof Medic) {
                ((Medic) abil).increaseExperience();
            }
        }
    }
}