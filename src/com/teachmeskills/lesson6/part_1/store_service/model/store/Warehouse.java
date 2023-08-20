package com.teachmeskills.lesson6.part_1.store_service.model.store;

import com.teachmeskills.lesson6.part_1.store_service.model.container.ShipContainer;


public class Warehouse {

    // Fields
    public String address;
    public ShipContainer[] containers;


    // Constructors
    public Warehouse() {
        this.address = "Amsterdam";
    }

    // TODO
    // добавить конструктов только с одним параметром - address +
    public Warehouse(String address) {
        this.address = address;
    }


    public Warehouse(String address, ShipContainer[] containers) {
        this.address = address;
        this.containers = containers;
    }


    // Methods
    public void setContainers(ShipContainer[] containers) {
        System.out.println("Adding containers");
        this.containers = containers;
        System.out.println("Containers are added");
    }

    // TODO
    // добавить метод добаваления новых контейнов в уже сущесвующий массив контейнеров
    // public void addContainers(Container[] containers)

    public void addContainers(ShipContainer[] containers) {
        for (int j = 0; ; j++) {
            if (containers[j] == null) {
                return;
            }
            else {
                this.containers[CountN()] = containers[j];
            }
        }
    }

    private int CountN() {
        int i = 0;
        for (ShipContainer container : containers) {
            if (container == null) return i;
            else {
                i++;
            }
        }
        return i;
    }
            // TODO
            // добавить метод для вывода стоимости всех контейнеров +
            // возвращаемый тип данных - число с плавающей точкой
    public double totalPrice() {
        double tPrice = 0;
        for(int k = 0; k < containers.length; k++){
            if(this.containers[k] != null) {
                tPrice += this.containers[k].price;
            }
        }
        return tPrice;
    }




            // TODO
            //

}


