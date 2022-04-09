package mso.javaoo;

public interface Autenticavel {

  boolean autenticar(int senha);

  // A interface ela só expõe o que o objeto deve fazer
  // e não como ele o faz, nem o que ele tem

  boolean registrar(int codigo);

}
