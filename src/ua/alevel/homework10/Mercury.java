package ua.alevel.homework10;

public class Mercury extends Planet implements PlanetInterface{

    public void printQuantityOfSatellite(){
        System.out.println(PlanetEnum.MERCURY.getQuantityOfSatellite());
    }

    public Mercury(String name, int radius, double weight, double distanceFromTheSun, double gravity){
        super(name, radius, weight, distanceFromTheSun, gravity);
    }

    @Override
    public void accelerationOfGravity() {
        System.out.println("Acceleration of gravity on Mercury: " + getGravity());
    }
}
