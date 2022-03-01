package be.intecbrussel;

public class SiamseCat extends Felis {

    public SiamseCat() {
    }

    public SiamseCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);

    }


    @Override
    public String toString() {
        return "SiamseCat{} " + super.toString();
    }


    }



