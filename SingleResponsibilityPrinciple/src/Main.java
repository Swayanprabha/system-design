
public class Main {
    public static void main(String[] args) {
 Cart cart=new Cart();
 cart.addProduct(new Product("laptop",1000));
 cart.addProduct(new Product("phone",500));
 PrintInvoiceService printInvoiceService=new PrintInvoiceService(cart);
 printInvoiceService.printCartInvoice();
 PriceService priceService=new PriceService(cart);
 System.out.println(priceService.countTotalPrice());

    }
}