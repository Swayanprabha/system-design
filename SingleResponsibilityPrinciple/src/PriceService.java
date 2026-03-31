import java.util.List;

public class PriceService {
    private Cart cart;
    PriceService(Cart cart) {
        this.cart = cart;
    }
    public double countTotalPrice()
    {
        List<Product> products = cart.getProducts();
        double total=0;
        for(Product product:products)
        {
            total+=product.getPrice();
        }
        return total;
    }
}
