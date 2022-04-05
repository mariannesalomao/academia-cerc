package mso.javaoo;

public class Cliente {
  private String nomeCliente;
  private String enderecoCliente;
  private String cpfCliente;
  private int idadeCliente;

  public void mudarCPF(String cpfCliente) {
    if (this.idadeCliente <= 60) {
      validarCPF(cpfCliente);
    } else {
      this.cpfCliente = cpfCliente;
    }
  }

  private void validarCPF(String cpfCliente) {
    // Série de regras para validar cpf válido
  }
}
