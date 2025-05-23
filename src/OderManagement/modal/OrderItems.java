package OderManagement.modal;

public class OrderItems {
    private Product[] product;
    private int quantity;

    public OrderItems(Product[] product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public OrderItems() {
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
