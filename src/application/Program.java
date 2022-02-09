package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER THE PRODUCT DATA BELOW: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		//System.out.print("Quantity in stock: ");
		//int quantity = sc.nextInt()
		
		//Product product = new Product(name, price, quantity);
		Product product = new Product(name, price);
		
		product.setName("Outra TV");
		System.out.println("Uptaded name: " + product.getName());
		
		product.setPrice(175.00);
		System.out.println("Uptaded price: " + product.getPrice());
		
		product.setQuantity(298);
		System.out.println("Uptaded quantity: " + product.getQuantity());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProdutcts(quantity);
		
		System.out.println();
		System.out.println("Update product data: " + product);
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update product data: " + product);
				
		sc.close();

	}

}
