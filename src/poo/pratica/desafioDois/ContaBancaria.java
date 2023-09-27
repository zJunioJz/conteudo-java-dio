package poo.pratica.desafioDois;
import java.text.DecimalFormat;
public class ContaBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }
}

class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        //TODO: Implementar adequadamente esta sobrecarga de construtores.
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        //TODO: Complementar as informações com a taxa de juros.
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println("Taxa de juros: " + decimalFormat.format(taxaJuros)+ "%");

    }
}
