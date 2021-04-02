package ua.alevel.homework10;

import java.beans.PropertyEditorSupport;

public class Earth extends Planet implements PlanetInterface{
    int quantityOfSeas;

    @Override
    public void printCharacteristics(){
        System.out.println("Name of planet: " + name + ".\nRadius is " + radius + ". \nWeight is " + weight + "\nDistance from the sun is " + distanceFromTheSun + "\nQuantity of seas: " + quantityOfSeas);
    }

    public Earth(String name, int radius, double weight, double distanceFromTheSun, double gravity, int quantityOfSeas){
        this.name = name;
        this.radius = radius;
        this.weight = weight;
        this.distanceFromTheSun = distanceFromTheSun;
        this.gravity = gravity;
        this.quantityOfSeas = quantityOfSeas;
    }


    @Override
    public void accelerationOfGravity(double gravity) {
        System.out.println("Acceleration of gravity on Earth: " + gravity);
    }
}
