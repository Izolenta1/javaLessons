package lab3;

public class TestPart3Shop {
    public static void main(String[] args) {
        Part3User userObj = new Part3User(120, "RUB");
        Part3Report reportObj = new Part3Report();
        Part3Converter converterObj = new Part3Converter();

        Part3Employee employeeObj = new Part3Employee("Alex", 14567.4507);
        reportObj.addEmployee(employeeObj);

        employeeObj = new Part3Employee("Buch", 23564.6489);
        reportObj.addEmployee(employeeObj);

        employeeObj = new Part3Employee("Katerine", 34225.77567);
        reportObj.addEmployee(employeeObj);

        Part3Shop shopObj = new Part3Shop(userObj, reportObj, converterObj);

        Part3Product productObj = new Part3Product(2000, "toy");
        shopObj.addProduct(productObj);

        productObj = new Part3Product(1340, "wood");
        shopObj.addProduct(productObj);

//        System.out.println(userObj.toString());
//        userObj.setBalanceAndCur(converterObj.convert("RUB", "EURO", userObj.getBalance()), "EURO");
//        System.out.println(userObj.toString());

        reportObj.generateReport();

        shopObj.wantToBuy(0);
    }
}
