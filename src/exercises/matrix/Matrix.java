package exercises.matrix;

public class Matrix {
    public static void main(String[] args) {
        double[][] matrix = new double[3][3];
        matrix[0][0] = 1.0;
        matrix[0][1] = 1.5;
        matrix[0][2] = 2.0;
        matrix[1][0] = 1.5;
        matrix[1][1] = 2.0;
        matrix[1][2] = 2.5;
        matrix[2][0] = 2.0;
        matrix[2][1] = 2.5;
        matrix[2][2] = 3.0;
        System.out.println(matrix[0][0] * matrix[1][1] * matrix[2][2] +
                matrix[0][2] * matrix[1][1] * matrix[2][0]);
        System.out.println((matrix[1][0] + matrix[1][1] + matrix[1][2]) / (matrix[0][1]
                + matrix[1][1] + matrix[2][1]));
        System.out.println(matrix[0][0] + matrix[0][1] + matrix[0][2] + matrix[1][0]
                + matrix[1][2] + matrix[2][0] + matrix[2][1] + matrix[2][2]);

    }
}
