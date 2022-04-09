## O objetivo aqui é criar um sistema com o objetivo de gerenciar as contas de um Banco

#### Os exercícios a seguir são extremamente importantes.

# Question 1.

> Modele uma conta.

> Ela deve ter o nome do titular ( String ), o número ( int ), a agência ( String ), o saldo ( double ) e uma data de abertura ( String ).

> Além disso, a conta deve fazer as seguintes ações: sacar para retirar um valor do saldo; depositar a fim de adicionar um valor ao saldo; calculaRendimento para devolver o seu ganho.

# Question 2.

> Na classe Conta, crie um método
recuperaDadosParaImpressao
() que não recebe parâmetro, mas devolve o texto com todas as informações da nossa conta para efetuarmos a impressão

# Question 3.

> Em vez de utilizar uma String para representar a data, crie uma outra classe chamada Data. Ela tem três campos int para dia, mês e ano. Faça com que sua conta passe a usá-la.


# Desafio

> Um método pode se chamar a si mesmo. Chamamos isso de recursão. Você pode resolver a série de Fibonacci usando um método que se chama a si mesmo. O objetivo é você criar uma classe que possa ser usada da seguinte maneira:

```java
Fibonacci fibonacci = new Fibonacci();

for(int i = 1; i <= 6; i++) {
  int resultado = fibonacci.calculaFibonacci(i);
  System.out.println(resultado);
}
```

> Aqui imprimirá a sequência de Fibonacci até a sexta posição, isto é: 1, 1, 2, 3, 5, 8.
Esse método calculaFibonacci não pode ter nenhum laço e só pode chamar-se a si mesmo sendo método. Pense nele como uma função que usa a si própria para calcular o resultado.



















