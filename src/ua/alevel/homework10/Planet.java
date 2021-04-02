package ua.alevel.homework10;

public class Planet {
    String name;
    int radius;
    double weight;
    double distanceFromTheSun;
    double gravity;

    // Выводит характеристики планеты
    public void printCharacteristics(){
        System.out.println("Name of planet: " + name + ".\nRadius is " + radius + ". \nWeight is " + weight + "\nDistance from the sun is " +distanceFromTheSun);
    }

    // Вычесляет диаментр планеты
    public int diameterOfPlanet(int radius){
        return radius * 2;
    }

}
