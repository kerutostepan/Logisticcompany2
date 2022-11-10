package com.example.logisticcompany.Back;

import java.util.Scanner;

public class DeepMenu extends Command {
    Scanner sc = new Scanner(System.in);

    public void menu1() {
        System.out.println("Виберіть цифру для подальшої роботи програми\n" +
                " 1.Подивитись країни поставищиків\n" +
                " 2.Додати країну поставщика\n" +
                " 3.Розрахувати приблизний термін доставки \n" +
                " 4.Розрахувати ціну оплати для клієнта, показати ціну закупки\n" +
                " 5.Перевірити замовлення клієнтів \n" +
                " 0.Головне меню");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number == 1) {
                menu1_1();
            } else if (number == 2) {
                menu1_2();
            } else if (number == 3) {
                menu1_3();
            } else if (number == 4) {
                menu1_4();
            } else if (number == 5) {
                menu1_5();
            } else if (number == 0) {
            }
        }
    }

    public void menu1_1() {
        name();
        System.out.println("0. Повернутись назад");
        int a = sc.nextInt();
        if (a == 1) {
        } else if (a == 0) {
            menu1();
        }
    }

    public void menu1_2() {
    genereta();


        System.out.println("0. Повернутись назад");
        int a = sc.nextInt();
        if (a == 1) {
        } else if (a == 0) {
           menu1();
        }
    }

    public void menu1_3() {
        System.out.println("Виберіть країну поставщика, якої хочете дізнатись термін доставки:\n" +
                " 1.Німеччина\n" +
                " 2.Британія\n" +
                " 3.Італія");
        if (sc.hasNextInt()) {
            int k = sc.nextInt();
            if (k == 1) {
              getTime(1);
            } else if (k == 2) {
                getTime(2);
            } else if (k == 3) {
             getTime(3);
            }
        }
        System.out.println("0. Повернутись назад");
        int a = sc.nextInt();
        if (a == 1) {
        } else if (a == 0) {
        menu1();
        }
    }

    public void menu1_4() {
        System.out.println("З якої країни ви хочете подивитись\n 1.Німеччина\n 2.Британія\n 3.Італія");
        if (sc.hasNextInt()) {
            int cc = sc.nextInt();
            if (cc == 1) {
                priceLogistic(1);
            } else if (cc == 2) {
                priceLogistic(2);
            } else if (cc == 3) {
                priceLogistic(3);
            }
        }
        System.out.println("0. Повернутись назад");
        int a = sc.nextInt();
        if (a == 1) {
        } else if (a == 0) {
            menu1();
        }
    }

    public void menu1_5() {
        System.out.println("Атб замовляє:");
        getpr("German");
        System.out.println("Ельдорадо замовляє:");
       getpr("British");
        System.out.println("Єва замовляє:");
       getpr("Italia");
        System.out.println();

        System.out.println("0. Повернутись назад");
        int a = sc.nextInt();
        if (a == 1) {
        } else if (a == 0) {
         menu1();
        }
    }

    public void menu20() {
        System.out.print(" Виберіть цифру подальшої роботи програми\n" +
                " Ви є: \n" +
                " 1.АТБ\n" +
                " 2.Ельдорадо\n" +
                " 3.EVA\n" +
                " 0.Головне меню");
        if (sc.hasNextInt()) {
            int c = sc.nextInt();
            if (c == 1) {
                menu2_1();
            } else if (c == 2) {
                menu2_2();
            } else if (c == 3) {
                menu2_3();
            }
        }
    }

    public void menu2_1() {
        System.out.println("Ви хочете: \n" +
                " 1.Добавити список побажань\n" +
                " 2.Показати список побажань\n" +
                " 3.Розрахувати ціну вашого замовлення\n" +
                " 4.Подивитись на ваше звичайне оптове замовлення\n" +
                " 5.Розрахувати приблизний термін отримання\n" +
                " 0.Повернутись назад");
        int k1 = sc.nextInt();
        if (k1 == 1) {
            countryAdd(1);
        } else if (k1 == 2) {
            countryShowWish();
        } else if (k1 == 3) {
            priceforclient("German");
            System.out.println();
        } else if (k1 == 4) {
           getpr("German");
        } else if (k1 == 5) {
            timeForClient(1);

        }
        System.out.println("9.Крок назад \n" +
                "0. Повернутись в меню");
        int a = sc.nextInt();
        if (a == 1) {
        } else if (a == 0) {
            menu20();
        } else if (a == 9) {
            menu2_1();
        }
    }

    public void menu2_2() {
        System.out.println("Ви хочете: \n" +
                " 1.Добавити список побажань\n" +
                " 2.Показати список побажань\n" +
                " 3.Розрахувати ціну вашого замовлення\n" +
                " 4.Подивитись на ваше звичайне оптове замовлення\n" +
                " 5.Розрахувати приблизний термін отримання\n" +
                " 0.Повернутись назад");
        int k1 = sc.nextInt();
        if (k1 == 1) {
            countryAdd(2);
        } else if (k1 == 2) {
            countryShowWish();
        } else if (k1 == 3) {
          priceforclient("British");
            System.out.println();
        } else if (k1 == 4) {
            getpr("British");
        }  else if (k1 == 5) {

            timeForClient(2);
        }
        System.out.println("9.Крок назад \n" +
                "0. Повернутись в меню");
        int a = sc.nextInt();
        if (a == 1) {
        } else if (a == 0) {
            menu20();
        } else if (a == 9) {
            menu2_2();
        }
    }

    public void menu2_3() {
        System.out.println("Ви хочете: \n" +
                " 1.Добавити список побажань\n" +
                " 2.Показати список побажань\n" +
                " 3.Розрахувати ціну вашого замовлення\n" +
                " 4.Подивитись на ваше звичайне оптове замовлення\n" +
                " 5.Розрахувати приблизний термін отримання\n" +
                " 0.Повернутись назад ");
        int k1 = sc.nextInt();
        if (k1 == 1) {
            countryAdd(3);
        } else if (k1 == 2) {
            countryShowWish();
        } else if (k1 == 3) {
            priceforclient("Italia");
            System.out.println();
        } else if (k1 == 4) {
           getpr("Italia");
        }  else if (k1 == 5) {
            timeForClient(3);

        }
        System.out.println("\n9.Крок назад \n" +
                "0. Повернутись в меню");
        int a = sc.nextInt();
        if (a == 1) {
        } else if (a == 0) {
            menu20();
        } else if (a == 9) {
            menu2_3();
        }
    }
}
