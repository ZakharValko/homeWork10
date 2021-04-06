package ua.alevel.homework10;

public class Mars extends Planet implements PlanetInterface{
    private String secondName;

    public void printQuantityOfSatellite(){
        System.out.println(PlanetEnum.MARS.getQuantityOfSatellite());
    }

    @Override
    public void printCharacteristics(){
        System.out.println("Name of planet: " + getName() + " or " + secondName + ".\nRadius is " + getRadius() + ". \nWeight is " + getWeight() + "\nDistance from the sun is " + getDistanceFromTheSun());
    }

    public Mars(String name, String secondName, int radius, double weight, double distanceFromTheSun, double gravity){
        super(name, radius, weight, distanceFromTheSun, gravity);
        this.secondName = secondName;
    }


    @Override
    public void accelerationOfGravity() {
        System.out.println("Acceleration of gravity on Mars: " + getGravity());
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Planet)) return false;
        Saturn other = (Saturn) obj;
        if(this.secondName != secondName) return false;
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
        result = prime * result + (int) getWeight();
        System.out.println(result);
        return result;
    }
}
