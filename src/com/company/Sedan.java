package com.company;

public class Sedan extends Car{


    int length;

    public Sedan(int length) {
        this.length = length;
    }

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public double getSalePrice()
    {
        double sp;
        if(length > 20){
            sp = super.regularPrice - super.regularPrice*5/100;
        }
        else
            sp = super.regularPrice - super.regularPrice*10/100;

        System.out.println("Sedan Sale Price is: " + sp);
        return sp;

    }// for this method implement this: If length>20 feet, 5%discount, Otherwise, 10%discount
}
