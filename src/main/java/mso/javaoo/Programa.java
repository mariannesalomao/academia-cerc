package mso.javaoo;

public class Programa {
  public static void main(String[] args) {
    Conta minhaConta = new Conta();

    System.out.println(minhaConta);

    int total = Conta.getTotalDeContas();
    System.out.println(total);

//    minhaConta.depositar(2000);
//    System.out.println("Saldo: " + minhaConta.getSaldo());

  }
}
