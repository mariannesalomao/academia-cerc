package mso.javaoo;

public class Quadrado extends Retangulo {
  public Quadrado() {
    super();
  }

  public Quadrado(String cor, double lado1, double lado2) {
    super(cor, lado1, lado2);
  }

  public Quadrado(String cor, double lado) {
    lado = super.getLado1();
  }

  @Override
  public double area() {
    return this.getLado1() * this.getLado2();
  }

  @Override
  public String toString() {
    return "Quadrado area " + area() + "cor " + super.getCor();
  }
}
