package lab4_1;

public class Task9Table  extends Task9Furniture {
    private String objName;

    public Task9Table(String material, double cost, String objName) {
        super(material, cost);
        this.objName = objName;
    }

    public String getObjName() {
        return objName;
    }
}
