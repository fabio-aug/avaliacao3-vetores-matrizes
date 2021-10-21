import javax.swing.*;

public class FabioAugusto_2 {

    public static boolean differentNumbers(int[] array, int number) {
        boolean returnFunction = false;
        for (int numberInt : array) {
            if (numberInt == number) {
                returnFunction = true;
                break;
            }
        }
        if (number < 1 || number > 99) {
            returnFunction = true;
        }
        return returnFunction;
    }

    public static void main(String[] args) {
        int[] numberSort = new int[15], lotoNada = new int[15];
        int count = 0;
        try {
            for (int i = 0; i < numberSort.length; i++) {
                int number = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + " número sorteado: "));
                while (differentNumbers(numberSort, number)) {
                    number = Integer.parseInt(JOptionPane.showInputDialog("Número já informado, informe outro: "));
                }
                numberSort[i] = number;
            }

            for (int i = 0; i < lotoNada.length; i++) {
                int number = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + " número apostado: "));
                while (differentNumbers(lotoNada, number)) {
                    number = Integer.parseInt(JOptionPane.showInputDialog("Número já informado, informe outro: "));
                }
                lotoNada[i] = number;
            }

            for (int i : lotoNada) {
                for (int j : numberSort) {
                    if (i == j) {
                        count++;
                    }
                }
            }

            switch (count) {
                case 13:
                    JOptionPane.showMessageDialog(null, "azarento");
                    break;
                case 14:
                    JOptionPane.showMessageDialog(null, "quaseNada");
                    break;
                case 15:
                    JOptionPane.showMessageDialog(null, "quaseTudo");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Nada");
                    break;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
