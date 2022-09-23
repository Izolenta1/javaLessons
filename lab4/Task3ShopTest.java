package lab4;

import java.util.Scanner;

public class Task3ShopTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task3Auth authObj = new Task3Auth();
        System.out.println("Введите логин и пароль");

        String login = sc.nextLine();
        String password = sc.nextLine();

        while (!login.equals(authObj.getLogin()) || !password.equals(authObj.getPassword())) {
            System.out.println("Ошибка, введите правильные данные");
            login = sc.nextLine();
            password = sc.nextLine();
        }

        System.out.println("Выберите каталог для просмотра (1 или 2)");
        int catNum = sc.nextInt();

        if (catNum == 1) {
            for (Task3ENUM1 prod : Task3ENUM1.values()) {
                System.out.println(prod);
            }
        }
        else if (catNum == 2) {
            for (Task3ENUM2 prod : Task3ENUM2.values()) {
                System.out.println(prod);
            }
        }

        System.out.println("Выберите продукт из предложенных");
        String prodName = sc.nextLine();
        prodName = sc.nextLine();
        System.out.println(prodName + " куплен");
    }
}
