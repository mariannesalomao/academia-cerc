```java
package mso.javaoo;

public class Conta {
  public String numeroDaConta;
  public String nomeTitular;
  public double saldo;
  public String numeroBanco = "070";
  Cliente titularCliente;

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

  boolean transferir(Conta destino, double valorTransferencia) {

    boolean retirou = this.sacar(valorTransferencia);
    if (!retirou) {
      return false;
    } else {
      destino.depositar(valorTransferencia);
      return true;
    }

//    this.saldo = this.saldo - valorTransferencia;
//    destino.saldo = destino.saldo + valorTransferencia;
  }
}

public class Cliente {
  String nomeCliente;
  String sobrenomeCliente;
  String cpfCliente;
}

```
