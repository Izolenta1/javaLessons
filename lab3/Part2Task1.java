package lab3;

public class Part2Task1 {
    public static void main(String[] args) {
        String str1 = "23.44";
        double dbl1 = Double.valueOf(str1);
        System.out.println(dbl1 + 1);

        System.out.println("============");

        String str2 = "45.43";
        double dbl2 = Double.parseDouble(str2);
        System.out.println(dbl2 + 1);

        System.out.println("============");

        Double task3 = 34.76;
        int int1 = task3.intValue();
        byte byte1 = task3.byteValue();
        float float1 = task3.floatValue();
        short short1 = task3.shortValue();
        long long1 = task3.longValue();
        double double3 = task3.doubleValue();

        System.out.println(task3);

        System.out.println("============");

        double dbltask5 = 45.21;
        String task5 = Double.toString(dbltask5);
        System.out.println(task5 + "test");
    }
}
