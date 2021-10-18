//Pranav Patel
// SBA EXERCISE 2

package com.company;

public class MyOwnAutoShop {

    public static void main(String[] args) {
	// write your code here

        /*Create MyOwnAutoShop class which contains the main() method. Perform the following within the main() method.
            Create an instance of the Sedan class and initialize all the fields with appropriate values. Use super(...)
        method in the constructor for initializing the fields of the superclass.

        Create two instances of the Ford class and initialize all the fields with appropriate values. Use super(...)
        ethod in the constructor for initializing the fields of the super class.

        Create an instance of the Car class and initialize all the fields with appropriate values.
        Display the sale prices of all instances.*/

        Sedan se = new Sedan( 45, 15000, "black" , 25);
        se.getSalePrice();

        Ford ford = new Ford(60,45000,"white", 2020, 2000 );
        ford.getSalePrice();

        Ford ford2 = new Ford(70,48000,"Blue", 2022, 1000 );
        ford2.getSalePrice();

        Truck truck  = new Truck(25, 25000, "White", 2010);
        truck.getSalePrice();

        Car car = new Car(30, 3000, "Yellow");
        System.out.println("Car Sale Price is: " + car.getSalePrice());


    }
}
