package lab2;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        System.out.println("Введите кол-во компьютеров");
        Scanner sc = new Scanner(System.in);

        Shop shopObj = new Shop();

        int compCount = sc.nextInt();
        for (int i = 0; i < compCount; i++) {
            System.out.println("Введите модель компьютера");
            String model = sc.next();

            System.out.println("Введите стоимость компьютера");
            int cost = sc.nextInt();

            Computer comp = new Computer(model, cost);
            shopObj.addComputer(comp);
        }

        shopObj.findComputer("testmodel");
    }
}
