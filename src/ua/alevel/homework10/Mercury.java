package ua.alevel.homework10;

public class Mercury extends Planet implements PlanetInterface{

    public Mercury(String name, int radius, double weight, double distanceFromTheSun, double gravity){
        setName(name);
        setRadius(radius);
        setWeight(weight);
        setDistanceFromTheSun(distanceFromTheSun);
        setGravity(gravity);
    }

    @Override
    public void accelerationOfGravity() {
        System.out.println("Acceleration of gravity on Mercury: " + getGravity());
    }
}
