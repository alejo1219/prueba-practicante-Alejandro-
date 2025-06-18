public class SaludoTest {
  public static void main(String[] args) {
    String saludo = saludo.obtenerSaludo("Alejandro"); 
  if (saludo.equals("hola, Alejandro! Bienvenido al mundo java")) { 
    System.out.println("test aprobado");
  } else { 
    System.out.println("Test fallido. Resultado: " + saludo);
  }
  }
}
