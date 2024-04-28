
package e.commerce.project;

import java.util.Scanner;
public class ECommerceProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        electronic_product smartphone = new electronic_product(1, "smartphone", 599.9f, "Samsung", 1);


        ClothingProduct tShirt = new ClothingProduct(2, "T-shirt", 19.99f, "Medium", "Cotton");

        Bookproduct oopBook = new Bookproduct(3, "OOP", 39.99f, "O’Reilly", "X Publications");


        System.out.println("Enter your customer ID:");
        int customerId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your address:");
        String address = scanner.nextLine();
        Customer customer = new Customer(customerId, name, address);

        System.out.println("How many products do you want to order?");
        int nProducts = scanner.nextInt();
        Cart cart = new Cart(customer.getCustomerId(), nProducts);


        for (int i = 0; i < nProducts; i++) {
            System.out.println("Enter product details for product " + (i + 1) + ":");
            System.out.println("Enter product type (1: Electronic, 2: Clothing, 3: Book):");
            int productType = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (productType) {
                case 1:
                    cart.addProduct(smartphone, i);
                    break;
                case 2:
                    cart.addProduct(tShirt, i);
                    break;
                case 3:
                    cart.addProduct(oopBook, i);
                    break;
                default:
                    System.out.println("Invalid product type.");
                    break;
            }
        }

  
        System.out.println("Do you want to place an order? (yes/no)");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("yes")) {
   
            Order order = cart.placeorder();
     
            order.printOrderInfo();
        } else {
            System.out.println("Order not placed.");
        }

        scanner.close();
    }
}

