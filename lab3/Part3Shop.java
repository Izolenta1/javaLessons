package lab3;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Part3Shop {
    private Part3User userObj;
    private Part3Report reportObj;
    private Part3Converter converterObj;

    private ArrayList<Part3Product> productMas;

    public Part3Shop(Part3User userObj, Part3Report reportObj, Part3Converter converterObj) {
        this.userObj = userObj;
        this.reportObj = reportObj;
        this.converterObj = converterObj;
        this.productMas = new ArrayList<>();
    }

    public void addProduct(Part3Product prod) {
        this.productMas.add(prod);
    }

    public void wantToBuy(int prodNum) {
        System.out.println("Info about this product");
        System.out.println("Name - " + productMas.get(prodNum).getName());
        System.out.println("Cost in RUB - " + Double.toString(productMas.get(prodNum).getCost()));
        System.out.println("Cost in USD - " + Double.toString(this.converterObj.convert("RUB", "USD", productMas.get(prodNum).getCost())));
        System.out.println("Cost in EURO - " + Double.toString(this.converterObj.convert("RUB", "EURO", productMas.get(prodNum).getCost())));
    }

}
