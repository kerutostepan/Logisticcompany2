package com.example.logisticcompany.Back;

import java.util.ArrayList;

public class Client extends Warehouse {
    public Client(String name, int way, ArrayList<String> production) {
        super(name, way, production);
    }

    void timeForClient(CountrySupplier f){
        double a = (f.getWay()/60)+48;
        System.out.println("Приблизний термін доставки +-: "+ a+" годин");
    }
    void priceforclient(CountrySupplier g){
        price(g);
        double priceforclient = getPrice() *1.25;
        System.out.print(priceforclient);
    }

}


