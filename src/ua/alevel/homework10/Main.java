package ua.alevel.homework10;

public class Main {
    public static void main(String[] args) {
        Earth earth = new Earth("Earth", 6347, 5.97, 149.6, 9.8, 73);
        Mars mars = new Mars("Mars", "Red Planet", 3397, 0.642, 227.9, 3.7);
        Mercury mercury = new Mercury("Mercury", 2939, 0.330, 57.9, 3.7);
        Saturn saturn = new Saturn("Saturn", 60281, 568, 1433.5, 10.4, 3);
        Venus venus = new Venus("Venus", 6052, 4.82, 108.2, 8.87);

        earth.printCharacteristics();
        earth.accelerationOfGravity();
        System.out.println("\n");
        mars.printCharacteristics();
        mars.accelerationOfGravity();


        LandTransport landTransport = LandTransport.newBuilder()
                .weight(12)
                .width(123)
                .height(432)
                .length(234)
                .power(54)
                .wheelsQuantity(4)
                .build();

        System.out.println(landTransport.wheelsQuantity);
        landTransport.toBuilder().power(10);
    }
}