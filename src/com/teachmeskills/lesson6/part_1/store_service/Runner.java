package com.teachmeskills.lesson6.part_1.store_service;

import com.teachmeskills.lesson6.part_1.store_service.model.container.ShipContainer;
import com.teachmeskills.lesson6.part_1.store_service.model.store.Warehouse;

import java.util.Arrays;

public class Runner {


    private static int countN = 0;

    public static void main(String[] args) {
        System.out.println("Start");

        Warehouse warehouse1 = new Warehouse();

        ShipContainer container1 = new ShipContainer(1, 2, 3, 34.1);
        ShipContainer container2 = new ShipContainer();
        ShipContainer container3 = new ShipContainer();
        ShipContainer container4 = new ShipContainer(10, 20, 30,40.1, "goodnamecontainer");


        ShipContainer[] containers = new ShipContainer[8];

        containers[0] = container1;
        containers[1] = container2;
        containers[2] = container3;
        containers[3] = container4;
        warehouse1.setContainers(containers);


        ShipContainer[] newLine = new ShipContainer[3];
        ShipContainer container5 = new ShipContainer(40, 50, 60, 70.2, "anothergoodnamecontainer");
        newLine[0] = container5;
        warehouse1.addContainers(newLine);

        System.out.println(Arrays.toString(containers));



        System.out.println("total price: " + warehouse1.totalPrice());
        System.out.println("End");




    }

}
