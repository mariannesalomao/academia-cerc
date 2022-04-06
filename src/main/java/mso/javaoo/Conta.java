package mso.javaoo;

public class Conta {
  String numeroDaConta;
  String nomeTitular;
  private double saldo;
  private static int totalDeContas;

  // Construtor
  Conta() {
    System.out.println("Criando minha conta");
    Conta.totalDeContas = Conta.totalDeContas + 1;
  }

  public static int getTotalDeContas() {
    return Conta.totalDeContas;
  }

  boolean sacar(double valor) {
    this.saldo = this.saldo - valor;
    return true;
  }

  boolean depositar(double quantidade) {
    this.saldo += quantidade;
    return true;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

}
