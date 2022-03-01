package be.intecbrussel;

public class Animal {
    protected static int count;
    private char size;
    private String color;
    private double weight;
    private char coat;

   {
       System.out.println("we are creating animal and cats ");
        count++;
    }
    public  Animal(){

    }

    public Animal(char size, String color) {
        this.size = size;
        this.color = color;
    }

    public Animal(char size, String color, double weight, char coat){
        this.size=size;
       this.weight=weight;
       this.color=color;
    }
    public Animal(Animal animal){
        this(animal.getSize(),animal.getColor(), animal.getWeight(), animal.getCoat());
    }

    public static int getCount() {
        return count;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getCoat() {
        return coat;
    }

    public void setCoat(char coat) {
        this.coat = coat;
    }
    public void  makeNoise(String sound){
       System.out.println("The animal make the sound");
    }

 public void sleep(){
        System.out.println("The Animal is sleeping");
 }

    public void eat(){
        System.out.println ("Animal is eating");
    }

    public  boolean IsAlive(){
        return true;
    }


}
