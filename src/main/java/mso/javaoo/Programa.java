package mso.javaoo;

//public class Programa {
//  public static void main(String[] args) {
//    Conta minhaConta = new Conta(); // A variável minhaConta é uma referência ao objeto conta.
//
//    minhaConta.numeroDaConta = "987998799";
//    minhaConta.nomeTitular = "Marianne";
//    minhaConta.saldo = 1000;
//
////    minhaConta.sacar(800);
//    minhaConta.depositar(200);
//
//    if (minhaConta.sacar(3000)) {
//      System.out.println("Saque efetuado");
//    } else {
//      System.out.println("Não foi possível efetuar o saque");
//    }
//
//    System.out.println(minhaConta.saldo);
//    System.out.println("A minha conta é: " + minhaConta.numeroDaConta + "\nO saldo é: " + minhaConta.saldo + "\nTitular: " + minhaConta.nomeTitular);
//  }
//}

//public class Programa {
//  public static void main(String[] args) {
//    Conta minhaConta;
//    minhaConta = new Conta();
//    minhaConta.saldo = 1000;
//
//    Conta meuSonhoDeConta;
//    meuSonhoDeConta = new Conta();
//    meuSonhoDeConta.saldo = 3000000;
//
//    // Quando declaramos uma variável para associar a um objeto (como no código abaixo), na verdade, essa variável não guarda
//    // o objeto em si, mas uma maneira de acessá-lo, chamada de referência.
//    Conta contaDoJoao = new Conta();
//
//
//    Conta c1;
//    // O correto de dizer é que c1 se refere a um objeto
//    c1 = new Conta();
//
//    // Em Java uma variável nunca é um objeto. Não há no Java, uma maneira de criar o que conhecemos como objeto pilha ou objeto local
//    // porque qualquer objeto em Java sem exceção é acessado por uma variável de referência.
//
//    Conta c2;
//    c2 = new Conta();
//
//    System.out.println(c2); // Conta@8efb846 Se não tivermos a variável referência, teríamos que passar o endereço
//    // de memória.
//
//
//  }
//}


public class Programa {
  public static void main(String[] args) {
    Conta c1 = new Conta();
    c1.depositar(100);

    Conta c2 = c1; // linha importante. c2 passa, nesse instante, a fazer referência ao mesmo objeto referenciado por c1.
    // Quando fazemos c2 = c1, estamos nos referindo exatamente ao mesmo objeto!

//    if (c2 == c1) {
//      System.out.println("Verdade"); // True
//    }

    // Se usar o operador (==) compara se os objetos (referências, na verdade) são o mesmo, e não se são iguais.
    // Para saber se dois objetos têm o mesmo conteúdo, você precisa comparar atributo por atributo.

    c2.depositar(200);

    System.out.println(c1.saldo);
    System.out.println(c2.saldo);
  }
}


// Modele uma conta. Ela deve ter nome do titular (String), o número da conta (int), a agência (String), o saldo (double)
//  e uma data de abertura da conta (String). Além disso, a conta deve fazer as seguinte ações sacar para retirar valor do saldo,
// depositar a fim de adicionar valor ao saldo, calcula rendimento para devolver o ganho mensal.

// saque recebe um valor como parâmetro e retira do saldo da conta.
// deposita que recebe um valor como parâmetro e adiciona ao saldo da conta.
// calcula rendimento não recebe parâmetro nenhum e devolve o valor do saldo multiplicado por 0.1
