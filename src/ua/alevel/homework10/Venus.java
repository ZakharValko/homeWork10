package ua.alevel.homework10;

public class Venus extends Planet implements PlanetInterface{

    public Venus(String name, int radius, double weight, double distanceFromTheSun, double gravity){
        super(name, radius, weight, distanceFromTheSun, gravity);
    }


    @Override
    public void accelerationOfGravity() {
        System.out.println("Acceleration of gravity on Venus: " + getGravity());
    }
}
