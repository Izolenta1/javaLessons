package lab4_1;

public class Task4Test {
    public static void main(String[] args) {
        Task4Matrix matrix1 = new Task4Matrix(2, 2);

        matrix1.printMatrix();

        double[][] testMatrix = {{1.0, 2.0}, {3.0, 5.0}};
        matrix1.sum(testMatrix);
        matrix1.printMatrix();

        matrix1.multiply(2.0);
        matrix1.printMatrix();
    }
}
