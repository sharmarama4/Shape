package be.intecbrussel;

public class Panthera extends Animal {

    public Panthera() {

    }

    public Panthera(char size, char coat, String color, double weight) {
        super('l', "Red", 15.2d, 'M');
    }

    public String roar() {

        return "Auauauuu";
    }

    public void hunt() {
        System.out.println("Panthera is hunting");
    }


}