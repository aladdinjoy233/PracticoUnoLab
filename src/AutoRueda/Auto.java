package AutoRueda;

import java.util.*;

public class Auto {
  private String color;
  private String patente;
  private double combustible;
  private ArrayList<Rueda> ruedas;

  public Auto() {
    combustible = 50;
    ruedas = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      ruedas.add(new Rueda());
    }
  }

  public Auto(String color, String patente) {
    this.color = color;
    this.patente = patente;
    combustible = 50;
    ruedas = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      ruedas.add(new Rueda());
    }
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getPatente() {
    return patente;
  }

  public void setPatente(String patente) {
    this.patente = patente;
  }

  public double getCombustible() {
    return combustible;
  }

  public void setCombustible(double combustible) {
    this.combustible = combustible;
  }

  public ArrayList<Rueda> getRuedas() {
    return ruedas;
  }

  public void setRuedas(ArrayList<Rueda> ruedas) {
    this.ruedas = ruedas;
  }
  
  public void avanzar(int distancia) {
    double combustibleNecesario = distancia / 10;

    boolean ruedaPinchada = false;

    for (Rueda rueda : ruedas) {
      if (rueda.getPresion() <= 0) {
        ruedaPinchada = true;
      }
    }

    if (ruedaPinchada) {
      System.out.println("No se puede avanzar, rueda pinchada..");
      return;
    }
    
    if (combustible >= combustibleNecesario) {
      combustible -= combustibleNecesario;
    }
  }
  
  public void retroceder(int distancia) {
    avanzar(distancia);
  }
  
  public void llenarTanque() {
    this.combustible = 50;
  }
  
  public void inflarRuedas() {
    for (Rueda rueda : ruedas) {
      rueda.inflarRueda();
    }
  }
  
  public void pincharRueda() {
    for (Rueda rueda : ruedas) {
      rueda.desinflarRueda(0.5);
    }
  }
}
