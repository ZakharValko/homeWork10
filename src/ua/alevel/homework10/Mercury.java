package ua.alevel.homework10;

public class Mercury extends Planet implements PlanetInterface{

    public Mercury(String name, int radius, double weight, double distanceFromTheSun, double gravity){
        this.name = name;
        this.radius = radius;
        this.weight = weight;
        this.distanceFromTheSun = distanceFromTheSun;
        this.gravity = gravity;
    }

    @Override
    public void accelerationOfGravity(double gravity) {
        System.out.println("Acceleration of gravity on Mercury: " + gravity);
    }
}
