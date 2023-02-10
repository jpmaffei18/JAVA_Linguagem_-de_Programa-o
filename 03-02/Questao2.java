import java.util.Scanner;

class Questao2 {
  public static void main(String[] args) {
    
  Scanner scanner = new Scanner(System.in);

    
    double n1, n2 , n3, media;



    System.out.println("Insira um número: ");
    n1 = scanner.nextDouble();

        System.out.println("Insira outro número: ");
    n2 = scanner.nextDouble();

        System.out.println("Insira mais um número: ");
    n3 = scanner.nextDouble();

    media = (n1 + n2 + n3)/3;
    
    System.out.println("A média entre os três números é igual a: " + media);
    scanner.close();

  }
  
    }
