package ua.alevel.homework10;

import java.util.Locale;

public class Planet {
    private String name;
    private int radius;
    private double weight;
    private double distanceFromTheSun;
    private double gravity;

    public Planet(String name, int radius, double weight, double distanceFromTheSun, double gravity) {
        this.name = name;
        this.radius = radius;
        this.weight = weight;
        this.distanceFromTheSun = distanceFromTheSun;
        this.gravity = gravity;
    }

    public String getName(){ return name; }

    public void setName(String name){
        this.name = name;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getDistanceFromTheSun(){
        return distanceFromTheSun;
    }

    public void setDistanceFromTheSun(double distanceFromTheSun){
        this.distanceFromTheSun = distanceFromTheSun;
    }

    public double getGravity(){
        return gravity;
    }

    public void setGravity(double gravity){
        this.gravity = gravity;
    }

    // Выводит характеристики планеты
    public void printCharacteristics(){
        System.out.println("Name of planet: " + name + ".\nRadius is " + radius + ". \nWeight is " + weight + "\nDistance from the sun is " +distanceFromTheSun);
    }

    // Вычесляет диаментр планеты
    public int diameterOfPlanet(int radius){
        return radius * 2;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Planet)) return false;
        Planet other = (Planet) obj;
        if(this.radius != other.radius) return false;
        if(this.weight != other.weight) return false;
        if(this.gravity != other.gravity) return false;
        if(!this.name.equals(other.name)) return false;
        if(this.distanceFromTheSun != other.distanceFromTheSun) return false;
        return true;
    }
}
