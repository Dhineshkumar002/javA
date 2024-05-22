import java.util.Scanner;

// import ProductPackage.Mobilebrand;
import ProductPackage.product;
import ProductPackage.Laptop.laptop;
import ProductPackage.Mobile.mobile;
import ProductPackage.Tv.tv;

public class main_pro {

    public static void main(String[] args) {
        System.out.println("Smart Store");
        System.out.println("------------------  Welcome To Our Smart Store  ------------------");
        System.out.println("Product List :");
        System.out.println();

        product p = new product();

        p.productList();

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Pick any one Product : ");
        p.selectedProduct = scan.nextLine();
        System.out.println();

        switch (p.selectedProduct) {
            case "Mobile":
                System.out.println("------------------  "+p.selectedProduct+"  ------------------");
                mobile m = new mobile();
                m.mobileData();
                break;
            case "Tv":
                System.out.println("------------------  "+p.selectedProduct+"  ------------------");
                tv t = new tv();
                t.tvDataa();
                break;
            case "Laptop":
                System.out.println("------------------  "+p.selectedProduct+"  ------------------");
                laptop l = new laptop();
                l.laptopData();
                break;
        
            default:
                System.out.println("Invalid Data......");
                break;
        }       
        scan.close();
    }
}
