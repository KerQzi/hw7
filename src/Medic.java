public class Medic extends Hero{
    private double healPoints = 35;

    public void increaseExperience() {
        int percentageIncrease = 10;
        healPoints = healPoints + ((healPoints * percentageIncrease) / 100);
        System.out.println("Healpoints increase to " + 10+"% and result is: " + getHealPoints());
    }

    public double getHealPoints() {
        return healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic use his Super Ability - HEALING");
    }
}
