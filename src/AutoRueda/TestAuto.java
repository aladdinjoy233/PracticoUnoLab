package AutoRueda;

public class TestAuto {

  public static void main(String[] args) {
    
    Auto a = new Auto();
    
    System.out.println(a.getCombustible());
    
    a.avanzar(10);
    
    System.out.println(a.getCombustible());
    
    a.retroceder(10);
    
    System.out.println(a.getCombustible());
    
    System.out.println(a.getRuedas());
    
    a.pincharRuedas();
    
    System.out.println(a.getRuedas());
    
    a.inflarRuedas();
    
    System.out.println(a.getRuedas());

    a.desinflarRuedas();
    System.out.println(a.getRuedas());

    
  }
  
}
