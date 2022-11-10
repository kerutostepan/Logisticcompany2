package com.example.logisticcompany.Back;

import java.util.Scanner;

public class Menu1 {
    private int b, c;
    Command a = new Command();

    public void menu() {
        boolean tru = true;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Добрий день, вітаю вас в програмі. Виберіть хто ви є : \n" +
                    " 1.Лінгвістична компанія\n" +
                    " 2.Замовник\n" +
                    " 0.Завершення роботи програми ");
            if (sc.hasNextInt()) {
                b = sc.nextInt();
                if (b == 1) {
                    a.menu1();
                } else if (b == 2) {
                    a.menu20();
                }else if (b == 0) {
                    tru= false;
                }
            }else {
                System.out.println("Неправильний ввід, повторіть");
            }

        }while (tru != false);
        }
    }


