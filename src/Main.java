public class Main {
    public static void main(String[] args) {

        HavingSuperAbility[] havingSuperAbilitiesHeroes = {new Magic(), new Medic(), new Warrior()};

        for (HavingSuperAbility abil : havingSuperAbilitiesHeroes) {
            abil.applySuperAbility();
            if (abil instanceof Medic) {
                ((Medic) abil).increaseExperience();
            }
        }
    }
}