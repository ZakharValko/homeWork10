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

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Planet)) return false;
        if(!(obj instanceof Saturn)) return false;
        Saturn other = (Saturn) obj;
        if(this.numberOfRings != numberOfRings) return false;
        if(this.getRadius() != other.getRadius()) return false;
        if(this.getWeight() != other.getWeight()) return false;
        if(this.getGravity() != other.getGravity()) return false;
        if(!this.getName().equals(other.getName())) return false;
        if(this.getDistanceFromTheSun() != other.getDistanceFromTheSun()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numberOfRings;
        System.out.println(result);
        return result;
    }
}
