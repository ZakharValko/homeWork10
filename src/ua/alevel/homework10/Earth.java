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

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Planet)) return false;
        if (!(obj instanceof Earth)) return false;
        Earth other = (Earth) obj;
        if(this.quantityOfSeas != other.quantityOfSeas) return false;
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
        result = prime * result + quantityOfSeas;
        System.out.println(result);
        return result;
    }
}
