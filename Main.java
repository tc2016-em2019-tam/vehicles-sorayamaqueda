package com.company;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Vehicle[] myArray = new Vehicle[5];

        myArray[0] = new Jeep("Fred's Jeep", 4, 5, 6);
        myArray[1] = new Jeep("Frank's Jeep", 4, 3,4);
        myArray[2] = new Hovercraft("Sue's Hover-craft", 6, 667, 8,0.0);
        myArray[3] = new Frigate("Money Waster", 2, 0.0, 0.0);
        myArray[4] = new PoliceCar("Unit 527", 4,65,4);

        for (int i=0; i<myArray.length; i++) {

            System.out.println(myArray[i].getName());

            if (myArray[i] instanceof LandVehicle) {
                LandVehicle lv = (LandVehicle)myArray[i];
                lv.Drive();
            }

        }

        LinkedList<Vehicle> Law = new LinkedList<>();

        Law.add(new Jeep("Jeep 98",4, 5.1,4));
        Law.add(new Hovercraft());
        Law.add(new PoliceCar());
        Law.add(new Frigate());
        Law.add(new Jeep());

        System.out.println("Printing of List");

        for (Vehicle vehicle : Law){
            System.out.println(vehicle.getName());

            if (vehicle instanceof LandVehicle){
                ((LandVehicle) vehicle).Drive();
                if (vehicle instanceof Frigate){
                    ((Frigate) vehicle).fireGun();
                }
            }
        }
        //Vehicle[] Law = new Vehicle[3];

       /* Law[1] = new PoliceCar("unit five",4);
        Law[2] = new PoliceCar("unit sixty-two", 4,23.0,4);
        Law[3] = new PoliceCar("unit six-one-nine",4,65.4,2);

        for (int k = 0; k < Law; k++){
            PoliceCar Pc = (PoliceCar)Law[k];
            Pc.Drive();;
        }*/
    }
}
