package lab4_1;

public class Task4Matrix {
    double[][] matrix;
    int rows;
    int columns;

    public Task4Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[columns][rows];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                this.matrix[i][j] = i;
            }
        }
    }

    public void sum(double[][] sumMatrix) {
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                this.matrix[i][j] += sumMatrix[i][j];
            }
        }
    }

    public void multiply(double num) {
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                this.matrix[i][j] *= num;
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(this.matrix[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
