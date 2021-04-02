package ua.alevel.homework10;

public class Mars extends Planet implements PlanetInterface{
    String secondName;

    @Override
    public void printCharacteristics(){
        System.out.println("Name of planet: " + name + " or " + secondName + ".\nRadius is " + radius + ". \nWeight is " + weight + "\nDistance from the sun is " + distanceFromTheSun);
    }

    public Mars(String name, String secondName, int radius, double weight, double distanceFromTheSun, double gravity){
        this.name = name;
        this.secondName = secondName;
        this.radius = radius;
        this.weight = weight;
        this.distanceFromTheSun = distanceFromTheSun;
        this.gravity = gravity;
    }


    @Override
    public void accelerationOfGravity(double gravity) {
        System.out.println("Acceleration of gravity on Mars: " + gravity);
    }
}
