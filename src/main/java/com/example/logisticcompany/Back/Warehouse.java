package com.example.logisticcompany.Back;

import java.util.ArrayList;

public class Warehouse extends CountrySupplier {
    private double price;
    private double priceforclient;
    private double time;
    public Warehouse(String name, int way, ArrayList<String> production) {
        super(name, way, production);
    }

    public Warehouse(double price, double priceforclient) {
        this.price = price;
        this.priceforclient = priceforclient;
    }

    void price(CountrySupplier f){
        double price = f.getWay()*12.25;
       this.price = price;

    }

    void time(CountrySupplier f){
        time = (f.getWay()/60);
        System.out.println("Приблизний термін доставки: "+ time+" годин");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceforclient() {
        return priceforclient;
    }

    public void setPriceforclient(double priceforclient) {
        this.priceforclient = priceforclient;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
