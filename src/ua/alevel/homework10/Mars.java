package ua.alevel.homework10;

public class Mars extends Planet implements PlanetInterface{
    private String secondName;

    @Override
    public void printCharacteristics(){
        System.out.println("Name of planet: " + getName() + " or " + secondName + ".\nRadius is " + getRadius() + ". \nWeight is " + getWeight() + "\nDistance from the sun is " + getDistanceFromTheSun());
    }

    public Mars(String name, String secondName, int radius, double weight, double distanceFromTheSun, double gravity){
        setName(name);
        this.secondName = secondName;
        setRadius(radius);
        setWeight(weight);
        setDistanceFromTheSun(distanceFromTheSun);
        setGravity(gravity);
    }


    @Override
    public void accelerationOfGravity() {
        System.out.println("Acceleration of gravity on Mars: " + getGravity());
    }
}
