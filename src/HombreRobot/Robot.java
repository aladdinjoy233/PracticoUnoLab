package HombreRobot;

public class Robot {
  private int bateria;
  private boolean estaDespierto = true;

  public Robot() {
    bateria = 1000;
  }

  public boolean isEstaDespierto() {
    return estaDespierto;
  }
  
  public void avanzar(int pasos) {
    if (!estaDespierto)
      return;
              
    int bateriaNecesaria = pasos / 10;
    
    if (bateria >= bateriaNecesaria)
      bateria -= bateriaNecesaria;
    else
      System.out.println("No hay suficiente bateria..");
  }
  
  public void retroceder(int pasos) {
    if (!estaDespierto)
      return;
              
    int bateriaNecesaria = pasos / 10;
    
    if (bateria >= bateriaNecesaria)
      bateria -= bateriaNecesaria;
    else
      System.out.println("No hay suficiente bateria..");
  }
  
  public void dormir() { estaDespierto = false; }
  
  public void despertar() { estaDespierto = true; }
  
  public void recargar() { bateria = 1000; }
  
  public boolean bateriaLLena() { return bateria == 1000; }
  
  public boolean bateriaVacia() { return bateria == 0; }
  
  public int energiaActual() { return bateria; }
  
}
