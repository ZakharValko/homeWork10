package ua.alevel.homework10;

public class Saturn extends Planet implements PlanetInterface{
    int numberOfRings;

    @Override
    public void printCharacteristics(){
        System.out.println("Name of planet: " + name + ".\nRadius is " + radius + ". \nWeight is " + weight + "\nDistance from the sun is " + distanceFromTheSun + "\nQuantity of rings: " + numberOfRings);
    }

    public Saturn(String name, int radius, double weight, double distanceFromTheSun, double gravity, int numberOfRings){
        this.name = name;
        this.radius = radius;
        this.weight = weight;
        this.distanceFromTheSun = distanceFromTheSun;
        this.gravity = gravity;
        this.numberOfRings = numberOfRings;
    }

    @Override
    public void accelerationOfGravity(double gravity) {

    }
}
