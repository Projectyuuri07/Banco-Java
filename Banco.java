import javax.swing.*;
import java.util.ArrayList;

class Banco {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;
    private static ArrayList<Banco> contas = new ArrayList<>();

    public Banco(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
        contas.add(this);
    }

    public Banco(int numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
        contas.add(this);
    }

    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            JOptionPane.showMessageDialog(null, "Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Valor de depósito inválido.");
        }
    }

    public void saque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque de R$" + valor + " realizado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Valor de saque inválido ou saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public static double visualizarSaldoTotalDoBanco() {
        double saldoTotal = 1000000;
        return saldoTotal;
    }
}

