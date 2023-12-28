package DAY3;

import java.util.Scanner;

public class ProductDetails {

    public static void main(String[] args) {
        
        Product product=new Product();
        product.inputProduct();
        product.displayProduct();

    }
    
}


class Product{

    int productId;
    String productName;
    float productPrice;
    static String companyName="Wipro";

    void inputProduct(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id of Product");
        productId=sc.nextInt();
        System.out.println("Enter Name of Product");
        productName=sc.nextLine();
        System.out.println("Enter Price of PRoduct");
        productPrice=sc.nextFloat();

    }

    void displayProduct(){

        System.out.println("Product id: "+productId);
        System.out.println("Name of Product: "+productName);
        System.out.println("Price of Product: ");
        System.out.println("Company Name: "+companyName);

    }
}