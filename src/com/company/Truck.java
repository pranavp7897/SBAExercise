package com.company;

public class Truck extends Car{


    int weight;

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    double getSalePrice(){
        double sp;
    if(weight > 2000){
      sp = super.regularPrice - super.regularPrice*10/100;
    }
    else
        sp = super.regularPrice - super.regularPrice*20/100;
        System.out.println("Truck sale price is: " + sp);
        return sp;
    } // for this method implement this: If weight>2000, 10%discount. Otherwise, 20%discount.
}
