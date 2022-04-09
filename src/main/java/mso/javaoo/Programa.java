package mso.javaoo;

public class Programa {
  public static void main(String[] args) {

    Quadrado quadrado = new Quadrado();
    Triangulo triangulo = new Triangulo("Azul", 5, 12);
    Circulo circulo = new Circulo("Verde", 10.2);
    Retangulo retangulo = new Retangulo("Rosa", 32, 12);

    quadrado.setCor("Roxo");
    quadrado.setLado1(4);
    quadrado.setLado2(4);

    System.out.println(quadrado);
    System.out.println(triangulo);
    System.out.println(circulo);
    System.out.println(retangulo);

  }
}
