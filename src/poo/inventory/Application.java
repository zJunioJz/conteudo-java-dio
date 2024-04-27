package poo.inventory;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criação de um novo objeto da classe Product
        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        // Lê o nome do produto fornecido pelo usuário
        product.name = sc.nextLine();
        System.out.print("Price: ");
        // Lê o preço do produto fornecido pelo usuário
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        // Lê a quantidade em estoque fornecida pelo usuário
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        // Lê a quantidade de produtos a serem adicionados ao estoque fornecida pelo usuário
        int quantity = sc.nextInt();
        // Chama o método addProducts() para adicionar produtos ao estoque
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        // Lê a quantidade de produtos a serem removidos do estoque fornecida pelo usuário
        quantity = sc.nextInt();
        // Chama o método removeProducts() para remover produtos do estoque
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        sc.close();
    }
}
