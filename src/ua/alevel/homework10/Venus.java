package ua.alevel.homework10;

public class Venus extends Planet implements PlanetInterface{

    public void printQuantityOfSatellite(){
        System.out.println(PlanetEnum.VENUS.getQuantityOfSatellite());
    }

    public Venus(String name, int radius, double weight, double distanceFromTheSun, double gravity){
        super(name, radius, weight, distanceFromTheSun, gravity);
    }


    @Override
    public void accelerationOfGravity() {
        System.out.println("Acceleration of gravity on Venus: " + getGravity());
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Venus)) return false;
        Venus other = (Venus) obj;
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
        result = prime * result + (int) getDistanceFromTheSun();
        System.out.println(result);
        return result;
    }
}
