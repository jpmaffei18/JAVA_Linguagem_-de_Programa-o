import java.util.Scanner;

class Questao1 {
  public static void main(String[] args) {
    
  Scanner scanner = new Scanner(System.in);

    
    double n1, n2 , n3, soma;



    System.out.println("Insira um número: ");
    n1 = scanner.nextDouble();

        System.out.println("Insira outro número: ");
    n2 = scanner.nextDouble();

        System.out.println("Insira mais um número: ");
    n3 = scanner.nextDouble();

    soma = (n1 + n2 + n3);
    
    System.out.println("A soma entre os três números é igual a: " + soma);
    scanner.close();

  }
  
    }
