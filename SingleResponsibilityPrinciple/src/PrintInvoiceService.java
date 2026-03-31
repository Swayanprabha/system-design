import java.util.List;

public class PrintInvoiceService {
    private Cart cart;
    PrintInvoiceService(Cart cart)
    {
        this.cart=cart;
    }
    public void printCartInvoice()
    {
        List<Product> products=cart.getProducts();
        int productCount=0;
        int totalPrice=0;
        for(Product product:products)
        {
            System.out.println("product name"+product.getName()+" "+"product price"+product.getPrice());
            productCount++;
            totalPrice+=product.getPrice();
        }
        System.out.println("total no of products are"+productCount+" "+"total product price is"+totalPrice);
    }
}
