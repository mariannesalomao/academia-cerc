package mso.javaoo;

public class Conta {
  public String numeroDaConta;
  public String nomeTitular;
  public double saldo;

  // ... outros atributos ...

  // this é uma referência à variável fora do método, ele aponta para a instância
//  void sacar(double quantidade) {
//    double novoSaldo = this.saldo - quantidade;
//    this.saldo = novoSaldo;
//  }

  void depositar(double quantidade) {
    this.saldo += quantidade;
  }

  // ... mais métodos

  boolean sacar(double valor) {
    if (this.saldo < valor) {
      return false;
    } else {
      this.saldo = this.saldo - valor;
      return true;
    }
  }
}
