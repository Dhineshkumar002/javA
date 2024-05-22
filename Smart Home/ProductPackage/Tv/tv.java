package ProductPackage.Tv;

import java.util.Scanner;

import ProductPackage.product;
import ProductPackage.Form.form;

public class tv {
    public double finalPrice;
    public String selectedModel;

    public void tvDataa() {
        product tp = new product();
        for (int i = 0; i < tp.tv_product.length; i++) {
            System.out.print(tp.tv_product[i] + "\t\t");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Pick one : ");
        selectedModel = scan.nextLine();
        System.out.println();

        switch (selectedModel) {
            case "LG":
                System.out.println("------------------  " + selectedModel + "  ------------------");
                System.out.println("Brand Name  : " + selectedModel);
                System.out.println("Model Name  : " + selectedModel + " Tv 55 inch");
                System.out.println("Price       : " + "70000");
                System.out.println("Discount    : " + "5%");
                finalPrice = (70000 - (70000 * 0.05));
                System.out.println("---------------------------");
                System.out.println("Final Price : " + finalPrice);
                System.out.println("---------------------------");
                break;
            case "Samsung":
                System.out.println("------------------  " + selectedModel + "  ------------------");
                System.out.println("Brand Name  : " + selectedModel);
                System.out.println("Model Name  : " + selectedModel + " Tv 55 inch");
                System.out.println("Price       : " + "70000");
                System.out.println("Discount    : " + "5%");
                finalPrice = (70000 - (70000 * 0.05));
                System.out.println("---------------------------");
                System.out.println("Final Price : " + finalPrice);
                System.out.println("---------------------------");
                break;
            case "Sony":
                System.out.println("------------------  " + selectedModel + "  ------------------");
                System.out.println("Brand Name  : " + selectedModel);
                System.out.println("Model Name  : " + selectedModel + " Tv 55 inch");
                System.out.println("Price       : " + "70000");
                System.out.println("Discount    : " + "5%");
                finalPrice = (70000 - (70000 * 0.05));
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
