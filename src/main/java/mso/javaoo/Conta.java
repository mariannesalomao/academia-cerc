package mso.javaoo;

public class Conta {
  private String numeroDaConta;
  private String nomeTitular;
  private double saldo;

  boolean sacar(double valor) {
    this.saldo = this.saldo - valor;
    return true;
  }

  boolean depositar(double quantidade) {
    this.saldo += quantidade;
    return true;
  }

  boolean transferir(Conta destino, double valorTransferencia) {
    boolean retirou = this.sacar(valorTransferencia);
//    return (!retirou) ? false : destino.depositar(valorTransferencia);
    return retirou && destino.depositar(valorTransferencia);
  }

  // Encapsulamento: ocultar todos os membros de uma classe (atributos)
  // além de esconder como funcionam os métodos
}
