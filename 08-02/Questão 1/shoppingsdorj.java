public class shoppingsdorj {

String nome, cidade, bairro, rua, numero;

public shoppingsdorj (String nome , String cidade, String bairro, String rua, String numero){
    
    this.nome = nome;
    this.cidade = cidade;
    this.bairro = bairro;
    this.rua = rua;
    this.numero = numero;
}

public void nome(){

    
    System.out.println("Nome do shopping:  " + nome);
    System.out.println("Cidade do shopping:  "+ cidade);
    System.out.println("Bairro do shopping:  "+ bairro);
    System.out.println("Rua do shopping:  "+ rua);
    System.out.println("Numero do shopping:  "+ numero);
}



public static void main(String[]args){
    shoppingsdorj shop = new shoppingsdorj ("Norte Shopping", "Rio de Janeiro", "Del Castilho", "Av. Dom Helder Câmara", "1313");
    shop.nome();
}

}


