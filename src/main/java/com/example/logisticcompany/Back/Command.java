package com.example.logisticcompany.Back;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Command {
    ArrayList<String> german = new ArrayList<>();
    ArrayList<String> british = new ArrayList<>();
    ArrayList<String> italia = new ArrayList<>();
    ArrayList<String> wish = new ArrayList<>();
    Warehouse a = new Warehouse(0, 0);
    Client p = new Client(null, 0, null);
    CountrySupplier German = new CountrySupplier("Germany", 2300, german);
    CountrySupplier British = new CountrySupplier("British", 2900, british);
    CountrySupplier Italia = new CountrySupplier("Italia", 700, italia);
    CountrySupplier f;


    public void country() {
        german.add("milk");
        german.add("blueberry");
        british.add("fridge");
        italia.add("cosmetic");
    }


    public void countryAdd(Integer n) {
        if (n == 1) {
            Scanner br = new Scanner(System.in);
            System.out.println("Введіть скільки елементів ви хочете добавити: ");
            int lenght = br.nextInt();
            for (int i = 0; i <= lenght; i++) {
                System.out.println("Введіть " + i + " Товар");
                wish.add(0, br.nextLine());
            }
        } else if (n == 2) {
            Scanner br = new Scanner(System.in);
            System.out.println("Введіть скільки елементів ви хочете добавити: ");
            int lenght = br.nextInt();
            for (int i = 0; i <= lenght; i++) {
                System.out.println("Введіть " + i + " Товар");
                wish.add(0, br.nextLine());
            }
        } else if (n == 3) {
            Scanner br = new Scanner(System.in);
            System.out.println("Введіть скільки елементів ви хочете добавити: ");
            int lenght = br.nextInt();
            for (int i = 0; i <= lenght; i++) {
                System.out.println("Введіть " + i + " Товар");
                wish.add(0, br.nextLine());
            }
        }

    }


    public void getpr(String f) {
        country();
        if (f == "German") {
            HashSet ger = new HashSet<>(german);
            System.out.println(ger + "-1000x ");

        } else if (f == "British") {
            HashSet bri = new HashSet<>(british);
            System.out.println(bri + "-1000x ");
        } else if (f == "Italia") {
            HashSet ita = new HashSet<>(italia);
            System.out.println(ita + "-1000x ");


        }

    }

    public void getprice(String f) {

        if (f == "German") {
            a.price(German);
        } else if (f == "British") {
            a.price(British);
        } else if (f == "Italia") {
            a.price(Italia);
        }
        System.out.print(a.getPrice());
    }

    public void priceforclient(String f) {
        if (f == "German") {
            p.priceforclient(German);
        } else if (f == "British") {
            p.priceforclient(British);
        } else if (f == "Italia") {
            p.priceforclient(Italia);
        }
    }

    public void priceLogistic(Integer n) {
        if (n == 1) {
            System.out.print("Ціна для клієнта = ");
            priceforclient("German");
            System.out.println();
            System.out.print("Ціна закупки = ");
            getprice("German");
        } else if (n == 2) {
            System.out.print("Ціна для клієнта = ");
            priceforclient("British");
            System.out.println();
            System.out.print("Ціна закупки = ");
            getprice("British");
        } else if (n == 3) {
            System.out.print("Ціна для клієнта = ");
            priceforclient("Italia");
            System.out.println();
            System.out.print("Ціна закупки = ");
            getprice("Italia");

        }
        System.out.println(n);
    }

    public void genereta() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> f2 = new ArrayList<>();
        Scanner br = new Scanner(System.in);
        System.out.println("Введіть скільки елементів ви хочете додати: ");
        int lenght = br.nextInt();
        for (int i = 0; i <= lenght; i++) {
            System.out.println("Введіть " + i + " Товар");
            f2.add(0, br.nextLine());
        }
        System.out.println("Введіть назву країни, яку хочете додати");
        String s = br.nextLine();
        CountrySupplier fg = new CountrySupplier(s, 0, f2);
        f = fg;
    }

    public void getTime(Integer n) {
        if (n == 1) {
            a.time(German);
        } else if (n == 2) {
            a.time(British);
        } else if (n == 3) {
            a.time(Italia);
        }
    }

    public void timeForClient(Integer n) {
        if (n == 1) {
            p.timeForClient(German);
        } else if (n == 2) {
            p.timeForClient(British);
        } else if (n == 3) {
            p.timeForClient(Italia);
        }
    }

    public void countryShowWish() {
        System.out.println(wish);
    }
    StringBuilder stringBuilder;
    public void name() {
        System.out.println(German.getName());
        System.out.println(British.getName());
        System.out.println(Italia.getName());
        stringBuilder.append(German.getName());
        stringBuilder.append(British.getName());
        stringBuilder.append(Italia.getName());
        if (f != null) {
            System.out.println(f.getName());
        }

    }
    public String v(){
return String.valueOf(stringBuilder);
    }

    //
    public void menu1() {
        DeepMenu deepMenu = new DeepMenu();
        all();
        deepMenu.menu1();
    }

    public void menu20() {
        DeepMenu deepMenu = new DeepMenu();
        all();
        System.out.println("Вітаю ще раз, наша компанія працює з постійними оптовими клієнтами");
        deepMenu.menu20();
    }

    public void all() {
        country();
    }
}
