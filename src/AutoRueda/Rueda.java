package AutoRueda;

public class Rueda {
  private String marca;
  private double presion;
  
  public Rueda() {
    presion = 28;
  }
  
  public Rueda(String marca) {
    this.marca = marca;
    presion = 28;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public double getPresion() {
    return presion;
  }

  public void setPresion(double presion) {
    this.presion = presion;
  }

  public void inflarRueda() {
    presion = 28;
  }

  void desinflarRueda(double cant) {

    if (presion >= cant) {
      presion -= cant;
    }

  }

  void pincharRueda() {
    presion = 0;
  }

  @Override
  public String toString() {
    return "{" + presion + '}';
  }
  
}
