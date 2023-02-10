import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
  Scanner scanner = new Scanner(System.in);

    
    String nome, endereco, genero, nacionalidade, profissao;
    int idade, dt;
    double cpf, rg, cnh;



    System.out.println("Insira seu nome: ");
    nome = scanner.nextLine();

        System.out.println("Insira sua idade: ");
    idade = scanner.nextInt();

        System.out.println("Insira seu endereço: ");
    endereco = scanner.nextLine();

        System.out.println("Insira sua data de nascimento: ");
    dt = scanner.nextInt();

        System.out.println("Insira seu cpf: ");
    cpf = scanner.nextDouble();

        System.out.println("Insira seu rg: ");
    rg = scanner.nextDouble();

        System.out.println("Insira seu cnh: ");
    cnh = scanner.nextDouble();

        System.out.println("Insira seu gênero: ");
    genero = scanner.nextLine();

        System.out.println("Insira sua nacionalidade: ");
    nacionalidade = scanner.nextLine();

        System.out.println("Insira sua profissão: ");
    profissao = scanner.nextLine();
    
    
    System.out.println("INFORMAÇÕES:" + "\n" + "\n" + "Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Endereço: " + endereco + "\n" + "Data de nascimento: " + dt + "\n" + "Cpf: " + cpf + "\n" + "Rg: " + rg + "\n" + "Cnh: " + cnh + "\n" + "Genero: " + genero + "\n" + "Nacionalidade: " + nacionalidade + "\n" + "Profissão: " + profissao);
    scanner.close();

  }
  
    }


