package ProductPackage.Mobile;

import java.util.Scanner;

import ProductPackage.product;
import ProductPackage.Form.form;

public class mobile {

    public double finalPrice;
    public String selectedModel;

    public void mobileData() {
        product mp = new product();
        for (int i = 0; i < mp.mobile_product.length; i++) {
            System.out.print(mp.mobile_product[i] + "\t\t");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Pick one : ");
        selectedModel = scan.nextLine();
        System.out.println();

        switch (selectedModel) {
            case "Iphone":
                System.out.println("------------------  " + selectedModel + "  ------------------");
                System.out.println("Brand Name  : " + selectedModel);
                System.out.println("Model Name  : " + selectedModel + " 13 pro");
                System.out.println("Price       : " + "150000");
                System.out.println("Discount    : " + "5%");
                finalPrice = (150000 - (150000 * 0.05));
                System.out.println("---------------------------");
                System.out.println("Final Price : " + finalPrice);
                System.out.println("---------------------------");
                break;
            case "Redmi":
                System.out.println("------------------  " + selectedModel + "  ------------------");
                System.out.println("Brand Name  : " + selectedModel);
                System.out.println("Model Name  : " + selectedModel + " note 7 pro");
                System.out.println("Price       : " + "20000");
                System.out.println("Discount    : " + "5%");
                finalPrice = (20000 - (20000 * 0.05));
                System.out.println("---------------------------");
                System.out.println("Final Price : " + finalPrice);
                System.out.println("---------------------------");
                break;
            case "Oneplus":
                System.out.println("------------------  " + selectedModel + "  ------------------");
                System.out.println("Brand Name  : " + selectedModel);
                System.out.println("Model Name  : " + selectedModel + "");
                System.out.println("Price       : " + "50000");
                System.out.println("Discount    : " + "5%");
                finalPrice = (50000 - (50000 * 0.05));
                System.out.println("---------------------------");
                System.out.println("Final Price : " + finalPrice);
                System.out.println("---------------------------");
                break;
            default:
                System.out.println();
                System.out.println("Invalid Data......");
                break;
        }
        System.out.println(" ");
        System.out.print("Buy Now" + "\t\t\t" + "Exit");
        System.out.println(" ");
        System.out.print("Pick one :");
        String choice = scan.nextLine();

        switch (choice) {
            case "Buy Now":
                System.out.println(" ");
                System.out.println("------------------  Buy Now  ------------------");
                form f = new form();
                f.userDetails(selectedModel, finalPrice);
                break;
            case "Exit":
                System.out.println("------------------  ThankYou For Visit Our Store   ------------------");
                break;
            default:
                System.out.println("Invalid Data......");
                break;
        }
        scan.close();
    }
}
