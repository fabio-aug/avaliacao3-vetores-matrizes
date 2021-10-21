import javax.swing.*;

public class FabioAugusto_1 {

    public static int addVehicle(int[] garage, int positionAdd) {
        boolean equals = false;
        if (positionAdd < 20) {
            int code = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o código do veículo para cadastro: "));
            for (int car : garage) {
                if (car == code) {
                    equals = true;
                    break;
                }
            }
            if (equals) {
                JOptionPane.showMessageDialog(null, "Já existe um veículo com esse código na garagem!!!");
            } else {
                garage[positionAdd] = code;
                positionAdd++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Garagem lotada!!!");
        }
        return positionAdd;
    }

    public static void consultVehicle(int[] garage) {
        boolean equals = false;
        int position = 0;
        int code = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o código do veículo para consulta: "));
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == code) {
                equals = true;
                position = i;
                break;
            }
        }
        if (equals) {
            JOptionPane.showMessageDialog(null, "O veíoculo está na posição " + (position + 1) + " do pátio (índice " + position + ")!!");
        } else {
            JOptionPane.showMessageDialog(null, "O não existe nenhum veículo com o código digitado!!!");
        }
    }

    public static void main(String[] args) {
        int[] garage = new int[20];
        int positionAdd = 0;
        try {
            while (true) {
                int option = Integer.parseInt(JOptionPane.showInputDialog(null, "" +
                        "=============\n" +
                        "MENU\n" +
                        "=============\n" +
                        "1 – Cadastrar Veículo\n" +
                        "2 – Consultar Veículo\n" +
                        "3 - Sair\n" +
                        "============="));

                if (option == 1) {
                    positionAdd = addVehicle(garage, positionAdd);
                } else if (option == 2) {
                    consultVehicle(garage);
                } else if (option == 3) {
                    break;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Informe somente valores válidos!!!");
        }
    }
}
