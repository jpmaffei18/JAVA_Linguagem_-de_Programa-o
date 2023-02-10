import java.util.Scanner;

class Questao3 {
  public static void main(String[] args) {
    
  Scanner scanner = new Scanner(System.in);

    
    double numero, quintaparte;



    System.out.println("Insira um número: ");
    numero = scanner.nextDouble();

    quintaparte = (numero)/5;
    
    System.out.println("A quinta parte do número inserido é: " + quintaparte);
    scanner.close();

  }
  
    }
