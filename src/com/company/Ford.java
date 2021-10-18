package com.company;

public class Ford extends Car{

    int year;
    int manufacturerDiscount;

    public Ford(int year, int manufacturerDiscount) {
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice(){
       double sp;
       sp = super.getSalePrice() - manufacturerDiscount;
       System.out.println("Ford Sale Price is: " + sp);
       return sp;
    } // for this method implement this: from the sale price computed from Car class, subtract the manufacturer Discount.
}
