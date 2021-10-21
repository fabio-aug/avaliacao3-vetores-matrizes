import javax.swing.*;
import java.util.Random;

public class FabioAugusto_3 {

    public static String constructMatrix(int[][] matrix) {
        String concat = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                concat += " " + matrix[i][j];
            }
            concat += "\n";
        }
        return concat;
    }

    public static void printA(int[][] red, int[][] green, int[][] blue) {
        int count;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                count = (red[i][j] + green[i][j] + blue[i][j]) / 10;
                red[i][j] = count;
                green[i][j] = count;
                blue[i][j] = count;
            }
        }
        JOptionPane.showMessageDialog(null,
        "Questão A: \n\n" +
                "\nMatriz Red: \n" + constructMatrix(red) +
                "\nMatriz Green: \n" + constructMatrix(green) +
                "\nMatriz Blue: \n" + constructMatrix(blue));
    }

    public static void printB(int[][] red, int[][] green, int[][] blue) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                red[i][j] = 255 - red[i][j];
                green[i][j] = 255 - green[i][j];
                blue[i][j] = 255 - blue[i][j];
            }
        }
        JOptionPane.showMessageDialog(null,
        "Questão B: \n\n" +
                "\nMatriz Red: \n" + constructMatrix(red) +
                "\nMatriz Green: \n" + constructMatrix(green) +
                "\nMatriz Blue: \n" + constructMatrix(blue));
    }

    public static void main(String[] args) {
        int[][] red = new int[10][10], green = new int[10][10], blue = new int[10][10];
        Random numberRandom = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                red[i][j] = numberRandom.nextInt(256);
                green[i][j] = numberRandom.nextInt(256);
                blue[i][j] = numberRandom.nextInt(256);
            }
        }

        printA(red, green, blue);
        printB(red, green, blue);
    }
}
