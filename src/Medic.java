public class Medic extends Hero{
    private double healPoints = 35;

    public Medic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    public void increaseExperience() {
        int percentageIncrease = 10;
        healPoints = healPoints + ((healPoints * percentageIncrease) / 100);
        System.out.println("Healpoints increase to " + 10+"% and result is: " + getHealPoints());
    }

    public double getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(double healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic use his Super Ability - " + getSuperAbilityType());
    }
}
