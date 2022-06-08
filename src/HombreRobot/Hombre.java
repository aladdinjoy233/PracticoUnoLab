package HombreRobot;

import java.util.*;

public class Hombre {
  
  public void jugarConRobot(Robot robot) {
    
//    robot.avanzar(500);
//    
//    robot.retroceder(20);
//    
//    System.out.println("Energia actual del robot: " + robot.energiaActual());

    robot.despertar();
    Scanner leer = new Scanner(System.in);
    int op;
      
    do {
      
      System.out.println("=== Menu Robot ===");
      System.out.println("1) Avanzar");
      System.out.println("2) Retroceder");
      System.out.println("3) Recargar");
      System.out.println("4) Informar Bateria");
      System.out.println("5) Dormir");
      
      op = Integer.parseInt(leer.nextLine());
      
      if (op > 5 || op < 1) {
        System.out.println("Opcion no valido");
        continue;
      }
      
      switch (op) {
      case 1:
        System.out.println("Ingrese la cantidad de pasos: ");
        int pasosAv = Integer.parseInt(leer.nextLine());
        robot.avanzar(pasosAv);
        break;
      case 2:
        System.out.println("Ingrese la cantidad de pasos: ");
        int pasosRet = Integer.parseInt(leer.nextLine());
        robot.retroceder(pasosRet);
        break;
      case 3:
        robot.recargar();
        System.out.println("Robot recargado!");
        break;
      case 4:
        System.out.println("Carga de la bateria: " + robot.energiaActual());
        break;
      case 5:
        System.out.println("Yendo a mimir");
      }
      
    } while (op != 5);
    
  }
  
}
