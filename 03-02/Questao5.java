import java.util.Scanner;

class Questao5 {
  public static void main(String[] args) {
    
  Scanner scanner = new Scanner(System.in);

    
    double n1, n2 ;



    System.out.println("Insira um número: ");
    n1 = scanner.nextDouble();

        System.out.println("Insira outro número: ");
    n2 = scanner.nextDouble();


    if(n1 > n2){

    System.out.println("O menor número é: " + n2);
}

    else if(n2 > n1){

        System.out.println("O menor número é: " + n1);
    }

    else {

        System.out.println("Os dois números são iguais");
    }

    scanner.close();

  }
}
  