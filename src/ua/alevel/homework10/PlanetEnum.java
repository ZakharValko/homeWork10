package ua.alevel.homework10;

public enum PlanetEnum {

    EARTH (1, "Earth"),
    MARS (2, "Mars"),
    SATURN (62, "Saturn"),
    VENUS (0, "Venus"),
    MERCURY (0, "Mercury");

    private int quantityOfSatellite;
    private String name;

    PlanetEnum(int quantityOfSatellite, String name) {
        this.quantityOfSatellite = quantityOfSatellite;
        this.name = name;
    }

    public int getQuantityOfSatellite(){
        return quantityOfSatellite;
    }

}

