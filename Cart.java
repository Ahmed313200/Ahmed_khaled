
package e.commerce.project;

public class Cart {
 private int customerId;
    private int nProducts;
    private product[] products;

    public Cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        this.products = new product[nProducts];
    }


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }

    public product[] getProducts() {
        return products;
    }

    public void setProducts(product[] products) {
        this.products = products;
    }


    public void addProduct(product product, int index) {
        if (index >= 0 && index < nProducts) {
            products[index] = product;
        }
    }

    public void removeProduct(int index) {
        if (index >= 0 && index < nProducts) {
            products[index] = null;
        }
    }

    Order placeorder() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
