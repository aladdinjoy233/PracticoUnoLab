//Hacer una clase Rueda, con atributo marca y presion,
//luego el auto debe tener 4 ruedas, y desde el main el
//auto debe inflar sus ruedas, la presion a 28.0/ se debe
//desinflar (reduce -0.5) (Auto desinfla rueda, pincha
//rueda)

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
    presion -= cant;
  }

  @Override
  public String toString() {
    return "{" + presion + '}';
  }
  
  
}
