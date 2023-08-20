package com.teachmeskills.lesson6.part_1.store_service.model.container;

public class ShipContainer {

    // Fields
    int width;
    int length;
    int depth;
    String containerModel;

    // TODO
    // доваить еще одно для описание стоимости контейнера +
    public double price;
    // Constructors
    public ShipContainer() {
        System.out.println("без параметров");
        this.width = 8;
        this.length = 9;
        this.depth = 11;
        this.containerModel = "Кастомный контейнер";
    }

    public ShipContainer(int width, int length, int depth, double price) {
        System.out.println("с параметрами");
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.price = price;
        this.containerModel = "Кастомный контейнер";
    }

    public ShipContainer(int width, int length, int depth, double price, String boxModel) {
        this.width = width;
        this.length = length;
        this.depth = depth;
        this.price = price;
        this.containerModel = boxModel;
    }

    @Override
    public String toString() {
        return "ShipContainer{" +
                "width=" + width +
                ", length=" + length +
                ", depth=" + depth +
                ", containerModel='" + containerModel + '\'' +
                ", price=" + price +
                '}';
    }
}
