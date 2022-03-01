package be.intecbrussel;

public class AndeanMountainCat extends Felis {
    public AndeanMountainCat() {

    }

    public AndeanMountainCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);

    }

    public void miauw(String customSound) {
        System.out.println(customSound);
    }

    @Override
    public boolean IsAlive() {
        return false;
    }

    @Override
    public String toString() {
        return "AndeanMountainCat{} " + super.toString();
    }




}



