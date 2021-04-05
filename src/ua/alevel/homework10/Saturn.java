package ua.alevel.homework10;

public class Saturn extends Planet implements PlanetInterface{
    private int numberOfRings;

    public void printQuantityOfSatellite(){
        System.out.println(PlanetEnum.SATURN.getQuantityOfSatellite());
    }

    @Override
    public void printCharacteristics(){
        System.out.println("Name of planet: " + getName() + ".\nRadius is " + getRadius() + ". \nWeight is " + getWeight() + "\nDistance from the sun is " + getDistanceFromTheSun() + "\nQuantity of rings: " + numberOfRings);
    }

    public Saturn(String name, int radius, double weight, double distanceFromTheSun, double gravity, int numberOfRings){
        super(name, radius, weight, distanceFromTheSun, gravity);
        this.numberOfRings = numberOfRings;
    }

    @Override
    public void accelerationOfGravity() {
        System.out.println("Acceleration of gravity on Saturn: " + getGravity());
    }
}
