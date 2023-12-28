import java.util.*;

public class ProductDetails{

    public static void main(String[] args) {
        
        Product product1=new Product();
        product1.inputProduct();
        product1.displayProduct();
        
        int arr[]=new int[4];
        Product parr[]=new Product[5];
        
        for(int i=0;i<5;i++){
        	
        	
        }
        
        
        

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
        productName=sc.next();
        
        System.out.println("Enter Price of PRoduct");
        productPrice=sc.nextFloat();

    }

    void displayProduct(){

        System.out.println("Product id: "+productId);
        System.out.println("Name of Product: "+productName);
        System.out.println("Price of Product: "+productPrice);
        System.out.println("Company Name: "+companyName);

    }
}