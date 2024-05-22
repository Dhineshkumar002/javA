package ProductPackage;

public class product {
    
    public String[] products = {"Mobile","Tv","Laptop"};
    public String[] mobile_product = {"Iphone","Redmi","OnePlus"};
    public String[] tv_product = {"LG","Samsung","Sony"};
    public String[] laptop_product = {"Mac","Asus","Msi"};


   public String selectedProduct;

    public void productList()
    {
        for (int i = 0; i < products.length; i++) {
            System.out.print(products[i]+"\t\t");
        }
    }
}
