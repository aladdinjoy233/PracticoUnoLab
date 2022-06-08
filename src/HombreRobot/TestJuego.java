package HombreRobot;

public class TestJuego {

  public static void main(String[] args) {
    
    Robot ultron = new Robot();
    
    Hombre tony = new Hombre();
    
    System.out.println("Hola Tony");
    tony.jugarConRobot(ultron);
    
    Hombre vision = new Hombre();
    
    System.out.println("Hola Vision");
    vision.jugarConRobot(ultron);
    
  }
  
}
