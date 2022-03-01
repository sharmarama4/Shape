package be.intecbrussel;

import java.util.Objects;

public class Felis extends Animal {
    public static int vaccitationCount;
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;

     {
        System.out.println("Felish cats are");
    count++;
    }

    public Felis() {

    }

    public Felis(String name, int age, int shelterNo, int badgeNo) {
        this.age = age;
        this.name = name;
        this.badgeNo = badgeNo;
        this.shelterNo = shelterNo;

    }

    public static void setVaccitationCount(int vaccitationCount) {
        Felis.vaccitationCount = vaccitationCount;
    }

    public static int getVaccitationCount() {

        return vaccitationCount;
    }



    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getShelterNo() {
        return shelterNo;
    }

    public void setShelterNo(int shelterNo) {
        this.shelterNo = (shelterNo<999)?-shelterNo:shelterNo;
    }

    public int getBadgeNo() {
        return badgeNo;
    }

    public void setBadgeNo(int badgeNo) {

        this.badgeNo =(badgeNo<999)?-badgeNo:badgeNo;

    }

    public void miauw() {
        System.out.println("Felis does Miauw");
    }

    public void intMiauwTimes(int times) {
        System.out.println("Felis MiauwTimes is=15");
    }

    public static int getNoOfVaccinatedCats(){
        return 4;
    }


    @Override
    public String toString() {
        return "Felis{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", shelterNo=" + shelterNo +
                ", badgeNo=" + badgeNo +
                "} " + super.toString();


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Felis)) return false;
        Felis felis = (Felis) o;
 return shelterNo== felis.shelterNo&&badgeNo==felis.badgeNo;
    }
    @Override
    public int hashCode() {
        return Objects.hash( shelterNo, badgeNo);
    }
}




