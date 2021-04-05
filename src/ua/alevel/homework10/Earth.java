package ua.alevel.homework10;

public class Earth extends Planet implements PlanetInterface{
    private int quantityOfSeas;

    public void printQuantityOfSatellite(){
        System.out.println(PlanetEnum.EARTH.getQuantityOfSatellite());
    }

    @Override
    public void printCharacteristics(){
        System.out.println("Name of planet: " + getName() + ".\nRadius is " + getRadius() + ". \nWeight is " + getWeight() + "\nDistance from the sun is " + getDistanceFromTheSun() + "\nQuantity of seas: " + quantityOfSeas);
    }

    public Earth(String name, int radius, double weight, double distanceFromTheSun, double gravity, int quantityOfSeas){
        super(name, radius, weight, distanceFromTheSun, gravity);
        this.quantityOfSeas = quantityOfSeas;
    }


    @Override
    public void accelerationOfGravity() {
        System.out.println("Acceleration of gravity on Earth: " + getGravity());
    }
}
