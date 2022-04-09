package mso.javaoo;

public class Circulo extends Figura {

  private double raio;

  public Circulo(String cor, double raio) {
    super(cor);
    this.raio = raio;
  }

  public Circulo(){}

  public double getRaio() {
    return raio;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }

  @Override
  public String toString() {
    return "Circulo raio " + raio + "cor " + super.getCor();
  }

  double getDiametro() {
    return raio * 2;
  }

  @Override
  public double area() {
    return (raio * raio) * 3.14;
  }
}
