
package e.commerce.project;


public class Order {
    private int customerId;
    private int orderId;
    private product[] products;
    private float totalPrice;

    public Order(int customerId, product[] products) {
        this.customerId = Math.abs(customerId);
        this.products = products;
        this.totalPrice = calculateTotalPrice();
    }


    private float calculateTotalPrice() {
        float totalPrice = 0;
        for (product product : products) {
            if (product != null) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }


    public void printOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products:");

        for (product product : products) {
            if (product != null) {
                System.out.println("Name: " + product.getName() + ", Price: $" + product.getPrice());
            }
        }

        System.out.println("Total Price: $" + totalPrice);
    }
} 
    

