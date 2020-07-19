package com.company;
import com.sun.xml.internal.ws.developer.UsesJAXBContextFeature;

import java.awt.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Select the type of Burger you want ");
        System.out.println("1 for healthy burger");
        System.out.println("2 for Deluxe Burger");
        System.out.println("Enter your selection");
       int selection =  scanner.nextInt();
        System.out.println("Enter meat type: 1 for Chicken, 2 for beef, 3 for pig, 4 for dog");
        int meatType = scanner.nextInt();
        System.out.println(meatTypeSelected(meatType));
        String array[] = new String[4];
        for( int i = 0; i < 4; i++){
            System.out.println("Enter addition: "+ (i+ 1) + "= " );
            array[i] = scanner.next().toLowerCase();
        }
        if ( selection == 1){
            int additionalPrice = 0;

            System.out.println("Healthy Burger selected");
            HealthyBurger healthyBurger  = new HealthyBurger(meatTypeSelected(meatType),"a", "b");

            healthyBurger.setAddition1(array[0]);
            System.out.println("cost of addition1 is " + healthyBurger.getAddition1() + " " + healthyBurger.additionPrice(healthyBurger.getAddition1()));
            additionalPrice += healthyBurger.additionPrice(healthyBurger.getAddition1()) ;


            healthyBurger.setAddition2(array[1]);
            System.out.println("cost of addition2 is " + healthyBurger.getAddition2() + " " + healthyBurger.additionPrice(healthyBurger.getAddition2()));
            System.out.println(healthyBurger.additionPrice(healthyBurger.getAddition2()));
            additionalPrice += healthyBurger.additionPrice(healthyBurger.getAddition2()) ;


            healthyBurger.setAddition3(array[2]);
            System.out.println("cost of addition3 is " + healthyBurger.getAddition3() + " " + healthyBurger.additionPrice(healthyBurger.getAddition3()));

            System.out.println(healthyBurger.additionPrice(healthyBurger.getAddition3()));
            additionalPrice += healthyBurger.additionPrice(healthyBurger.getAddition3()) ;


            healthyBurger.setAddition4(array[3]);
            System.out.println("cost of addition4 is " + healthyBurger.getAddition4() + " " + healthyBurger.additionPrice(healthyBurger.getAddition4()));
            System.out.println(healthyBurger.additionPrice(healthyBurger.getAddition4()));
            additionalPrice += healthyBurger.additionPrice(healthyBurger.getAddition4()) ;


            System.out.println("The total cost i with additional price is : " + (healthyBurger.price() + additionalPrice));
            // while(true) : unconditional loop
        }
        else if (selection ==2){
            int additionalPrice = 0;
            System.out.println("Deluxe Burger selected");
            DeluxeBurger deluxeBurger = new DeluxeBurger(meatTypeSelected(meatType));


            deluxeBurger.setAddition1(array[0]);
            deluxeBurger.setAddition2(array[1]);
            deluxeBurger.setAddition3(array[2]);   //same above calling
            deluxeBurger.setAddition4(array[3]);
            System.out.println("The total cost is : " + deluxeBurger.price());


        } else {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
    public static String meatTypeSelected(int meatType){
        String meat;
        switch (meatType){
            case 1:
                meat = "chicken";
                break;
            case 2:
                meat = "beef";
                break;
            case 3:
                meat = "pig";
                break;
            case 4:
                meat =  "Dog";
                break;
            default:
                meat = "No meat selected";
                break;
        }
        return meat;
    }

}
