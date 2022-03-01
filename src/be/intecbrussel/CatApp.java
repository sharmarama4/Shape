package be.intecbrussel;

public class CatApp {
    public static void main(String[] args) {
        //This is my Animal Class
        Animal animal = new Animal('M', "white", 15, 'l');
      System.out.println("The animal isAlive :" + animal.IsAlive());
        animal.eat();
        animal.sleep();
        animal.makeNoise("Wowow");
        System.out.println();


        Panthera panthera = new Panthera();
        System.out.println("Panthera roar " + panthera.roar());
        panthera.hunt();
        System.out.println();

        Acinonyx acinonyx = new Acinonyx();
        acinonyx.kiauuww();
        acinonyx.run(25 - 45d);
        System.out.println();

//This my cats class
        NorwegianForestCat norwegianForestCat = new NorwegianForestCat("NorwegianForestCat", 0, 0, 0);
        norwegianForestCat.miauwlnNorvegian();
        System.out.println();

        Felis felis = new Felis();
        felis.miauw();
        felis.intMiauwTimes(15);
        felis.setVaccitationCount(5);
        System.out.println("The vaccitationCount of cats = " + felis.getVaccitationCount());
        System.out.println("The number of vaccinated cats =" + felis.getNoOfVaccinatedCats());
        System.out.println();
        AndeanMountainCat andeanMountainCat = new AndeanMountainCat();
        System.out.println("The AndeanMountainCat isAlive= " + andeanMountainCat.IsAlive());
        System.out.println();


        SiamseCat siamseCat = new SiamseCat("maya", 10, 333, 543);
        System.out.println("The SiamseCAt isAlive = " + siamseCat.IsAlive());
        System.out.println();
        PersianCat persianCat = new PersianCat("Hary", 15, 333, 543);
        System.out.println("SiamseCat and PersianCat are Same=" + persianCat.equals(siamseCat));


        persianCat.miauw();
        System.out.println();

        TurkishVanCat turkishVanCat = new TurkishVanCat();
        turkishVanCat.nickName("Gori");
        System.out.println();

        Felis[] felises = new Felis[7];
        felises[0] = andeanMountainCat;
        felises[1] = new PersianCat("maya", 12, 12, 18);
        felises[2] = persianCat;
        felises[3] = siamseCat;
        felises[4] = turkishVanCat;
        felises[5] = new AndeanMountainCat();
        felises[6] = new SiamseCat("Harry", 10, 333, 543);

        printFelis(felises);
    }

    private static void printFelis(Felis[] felises) {
        for (Felis s : felises) {
            System.out.println("The classes of felisCat are" + s.getClass());
        }


System.out.println("The number of animal and cats are created= "+Animal.getCount());

    }

}