package lab4;

public class Task1 {
    public static void main(String[] args) {
        Task1ENUM season1 = Task1ENUM.WINTER;
        System.out.println(season1);
        System.out.println(season1.getAverageTemp());
        System.out.println("===========================");

        Task1ENUM season2 = Task1ENUM.WINTER;

        switch (season2) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
        System.out.println("===========================");

        for (Task1ENUM season : Task1ENUM.values()) {
            System.out.println(season);
            System.out.println(season.getAverageTemp());
            System.out.println(season.getDescription());
            System.out.println("==");
        }
    }
}
