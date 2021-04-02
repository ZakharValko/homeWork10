package ua.alevel.homework10;

public class Venus extends Planet implements PlanetInterface{

    public Venus(String name, int radius, double weight, double distanceFromTheSun, double gravity){
        this.name = name;
        this.radius = radius;
        this.weight = weight;
        this.distanceFromTheSun = distanceFromTheSun;
        this.gravity = gravity;
    }


    @Override
    public void accelerationOfGravity(double gravity) {
        System.out.println("Acceleration of gravity on Venus: " + gravity);
    }
}
