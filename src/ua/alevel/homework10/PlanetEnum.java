package ua.alevel.homework10;

public enum PlanetEnum {

    EARTH (1),
    MARS (2),
    SATURN (62),
    VENUS (0),
    MERCURY (0);

    private int quantityOfSatellite;

    PlanetEnum(int quantityOfSatellite) {
        this.quantityOfSatellite = quantityOfSatellite;
    }

    public int getQuantityOfSatellite(){
        return quantityOfSatellite;
    }

}

