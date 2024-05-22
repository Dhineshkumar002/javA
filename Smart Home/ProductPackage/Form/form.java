package ProductPackage.Form;

import java.util.Scanner;

public class form {
    
    String fullName;
    String mobileNumber;
    String address;
    int poductId;
    int quantity;

    public void userDetails(String product,Double price)
    {

        Scanner scan = new Scanner(System.in);
        System.out.print("Full Name : ");
        fullName=scan.nextLine();
        System.out.print("Mobile Number : ");
        mobileNumber=scan.nextLine();
        System.out.print("Address : ");
        address = scan.nextLine();
        System.out.print("Quantity : ");
        quantity = scan.nextInt();

        System.out.println("------------------  Bill  ------------------");

        System.out.println(" ");
        // System.out.println("Full Name     : "+fullName);
        // System.out.println("Mobile Number : "+mobileNumber);
        // System.out.println("Address       : "+address);
        // System.out.println("Product Detail: "+product);
        // System.out.println("Quantity      : "+quantity);
        // System.out.println("Total Price   : "+quantity*price);

        System.out.print("Full Name"+"\t\t"+"Mobile Number"+"\t\t"+"Address"+"\t\t"+"Product Detail"+"\t\t"+"Quantity"+"\t\t"+"Total Price");
        System.out.print(fullName+"\t\t"+mobileNumber+"\t\t"+address+"\t\t"+product+"\t\t"+quantity+"\t\t"+quantity*price);

        System.out.println(" ");
        System.out.println("------------------  Thank You!!  ------------------");
        System.out.println("------------------  Visit Again...  ------------------");
        scan.close();
    }
}
