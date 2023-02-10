import java.util.Scanner;

class Questao4 {
  public static void main(String[] args) {
    
  Scanner scanner = new Scanner(System.in);

    
    double numero, quadrado;



    System.out.println("Insira um número: ");
    numero = scanner.nextDouble();

    quadrado = (numero * numero);
    
    System.out.println("A quadrado do número inserido é: " + quadrado);
    scanner.close();

  }
  
    }
