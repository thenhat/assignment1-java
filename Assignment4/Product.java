package Assignment4;

public class Product {
    public int id;
    public String productName;
    public int qty;
    public int price;

    public Product(){}

    public Product(int id,String productName,int qty,int price){
        this.id=id;
        this.productName=productName;
        this.qty=qty;
        this.price=price;
        if (qty>0){
           System.out.println("Còn Hàng");
        }else {
            System.out.println("Hết Hàng");
        }
    }
}
