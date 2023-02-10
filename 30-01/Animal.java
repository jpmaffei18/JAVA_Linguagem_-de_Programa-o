import java.util.Scanner;

public class Animal{
    
public static void animal(String[] args){

    Scanner scanner = new Scanner(System.in);

    char nome, cor, raca;
    double tamanho;

    System.out.println("Insira o nome do animal: ");
    nome = scanner.nextLine();

    System.out.println("Insira a cor do animal: ");
    cor = scanner.nextLine();

    System.out.println ("Insira o raca do animal: ");
   raca = scanner.nextLine();

    System.out.println ("Insira a tamanho do animal: ");
    tamanho = scanner.nextdouble();

    System.out.println("nome: " + nome + "\n" + "cor: " + cor + "\n" + "raça: " + raca + "tamanho: " + tamanho);
    }

}