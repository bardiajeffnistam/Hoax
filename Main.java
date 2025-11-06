import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // TODO A1: Ask the user for item name, price, and quantity
        // Example:
        // Item: Milk
        // Price: 3.49
        // Quantity: 2
System.out.println("What is the name of the item? ");
String item = sc.nextLine();

System.out.println("What is the price for this Item? ");
double price = sc.nextDouble();
sc.nextLine();
System.out.println("What is the quantity of this item? ");
int quantity = sc.nextInt();
        // TODO B1: Calculate the total cost (price * quantity)
double total = price*quantity;
        // TODO C1: Create a FileWriter for "receipt.txt"
        // TODO C2: Write all purchase details to the file
        // TODO C3: Close the FileWriter and print "Receipt saved!"
        FileWriter writer = new FileWriter("Receipt.txt");
        writer.write("Item: "+item+"\nPrice: $"+price+"\nQuantity: "+quantity);
        writer.write("\nTotal Price: $"+total);
        writer.close();
        System.out.println("Receipt saved!");
    }
}