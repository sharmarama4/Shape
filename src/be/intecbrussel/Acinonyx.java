package be.intecbrussel;

public class Acinonyx extends Animal {

    private double  speed;

    public Acinonyx(){

    }

    public Acinonyx(double speed){

        this.speed=speed;
    }
   public Acinonyx(double speed,char size,char coat,String color,double weight) {
       super(size, color, weight, coat);
       this.speed = speed;
   }
   public Acinonyx(Acinonyx acinonyx){
      this(acinonyx.getSpeed(),acinonyx.getCoat(),acinonyx.getSize(),acinonyx.getColor(),acinonyx.getWeight());
        }

    public double getSpeed() {

        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void kiauuww(){

        System.out.println("Acinonyx does kiauuww");
    }
    public void run(double distance){
        System.out.println("The cat has a distance of ");
    }


}

