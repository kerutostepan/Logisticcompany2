package com.example.logisticcompany.Back;

import java.util.ArrayList;

public class CountrySupplier {
    private String name;
    private int way;
    private ArrayList<String> production = new ArrayList<String>();

    public CountrySupplier(String name, int way, ArrayList<String> production) {
        this.name = name;
        this.way = way;
        this.production = production;
    }

    public CountrySupplier() {

    }

    @Override
    public String toString() {
        return getName() + "    " + getWay();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWay() {
        return way;
    }

    public void setWay(int way) {
        this.way = way;
    }

    public ArrayList<String> getProduction() {
        return production;
    }

    public void setProduction(ArrayList<String> production) {
        this.production = production;
    }
}
