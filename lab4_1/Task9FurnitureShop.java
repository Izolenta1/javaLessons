package lab4_1;

import java.util.Scanner;

public class Task9FurnitureShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Task9Furniture[] furnitureList = new Task9Furniture[2];

        Task9Table Obj = new Task9Table("glass", 1254, "GlassTable");
        furnitureList[0] = Obj;

        Obj = new Task9Table("wood", 12134, "WoodenTable");
        furnitureList[1] = Obj;

        System.out.print("Доступные продукты: ");
        for (int i = 0; i < furnitureList.length; i++) {
            System.out.print(furnitureList[i].getObjName() + " ");
        }
        System.out.print("\n");
        System.out.println("Введите название продукта, что вы хотите купить");

        String prodName = sc.nextLine();
        for (int i = 0; i < furnitureList.length; i++) {
            if (furnitureList[i].getObjName().equals(prodName)) {
                System.out.println(furnitureList[i].getObjName() + " куплен");
                furnitureList[i] = null;
            }
        }

        System.out.print("Доступные продукты: ");
        for (int i = 0; i < furnitureList.length; i++) {
            if (furnitureList[i] != null) {
                System.out.print(furnitureList[i].getObjName() + " ");
            }
        }
    }
}
