package lab7.task4;

public class Task4MathFunc implements Task4MathCalculable{
    private double comA;
    private double comB;

    public Task4MathFunc(double comA, double comB) {
        this.comA = comA;
        this.comB = comB;
    }



    @Override
    public double degree(double a, int b) {
        double result =1;
        for(int i=1;i<=b;i++){
            result = result *a;
        }
        return result;
    }

    @Override
    public double comNum() {
        return Math.sqrt(comA * comA + comB * comB); //|z| = sqrt(a^2 + b^2)
    }


    @Override
    public double PI() {
        return Math.PI;
    }
}
