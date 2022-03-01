package be.intecbrussel;

public class NorwegianForestCat extends Felis {

    public NorwegianForestCat(){

    }
    public NorwegianForestCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }
    public void miauwlnNorvegian(){
        System.out.println("NorwegianForestCat is miauwlnNorvegian");
    }

    @Override
    public String toString() {
        return "NorwegianForestCat{} " + super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
