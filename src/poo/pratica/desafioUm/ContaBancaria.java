package poo.pratica.desafioUm;

public class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int numero() {
        return numero;
    }

    public String titular() {
        return titular;
    }

    public double saldo() {
        return saldo;
    }
}
