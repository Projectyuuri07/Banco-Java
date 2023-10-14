import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta:"));
        String nomeTitular = JOptionPane.showInputDialog("Informe o nome do titular:");

        Banco conta = new Banco(numeroConta, nomeTitular);

        while (true) {
            String[] menuOptions = {
                    "1 - Depósito",
                    "2 - Saque",
                    "3 - Visualizar Saldo",
                    "4 - Visualizar Saldo Total do Banco",
                    "0 - Sair"
            };

            String escolha = (String) JOptionPane.showInputDialog(
                    null,
                    getMenuMessage(menuOptions),
                    "Escolha a operação",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    menuOptions,
                    menuOptions[0]
            );

            switch (escolha.substring(0, 1)) {
                case "1":
                    double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de depósito:"));
                    conta.deposito(valorDeposito);
                    break;
                case "2":
                    double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de saque:"));
                    conta.saque(valorSaque);
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Saldo da conta " + conta.getNumeroConta() + " - " + conta.getNomeTitular() + ": R$" + conta.getSaldo());
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Saldo Total do Banco: R$" + Banco.visualizarSaldoTotalDoBanco());
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Saindo do programa.");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }

    private static String getMenuMessage(String[] options) {
        StringBuilder message = new StringBuilder("Escolha a operação:\n");
        for (String option : options) {
            message.append(option).append("\n");
        }
        return message.toString();
    }
}
