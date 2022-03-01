package be.intecbrussel;

public class TurkishVanCat extends Felis {

    public TurkishVanCat() {
   this(null,0,0,0);
    }

    public TurkishVanCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

    public void nickName(String nickName) {
        System.out.println(nickName);
    }



    @Override
    public String toString() {

        return "TurkishVanCat{} " + super.toString();
    }


    }

