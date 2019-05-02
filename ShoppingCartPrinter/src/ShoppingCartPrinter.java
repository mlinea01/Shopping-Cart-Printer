
import java.util.Scanner;

public class ShoppingCartPrinter {

    public static void main(String[] args) {
        String itemName;
        int itemPrice;
        int itemQuantity;
        int itemOneTotal = 0;
        int itemTwoTotal = 0;
        int totalPrice = 0;
        Scanner scnr = new Scanner(System.in);
        
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();
        
        System.out.println("Item 1");
        System.out.println("Enter the item name: ");
        itemName = scnr.nextLine();
        
        System.out.println("Enter the item price: ");
        itemPrice = scnr.nextInt();
        
        System.out.println("Enter the item quantity: ");
        itemQuantity = scnr.nextInt();
        
        item1.setName(itemName);
        item1.setPrice(itemPrice);
        item1.setQuantity(itemQuantity);
        itemOneTotal = itemPrice * itemQuantity;
        System.out.println("");
        
        scnr.nextLine();
        
        System.out.println("Item 2");
        System.out.println("Enter the item name: ");
        itemName = scnr.nextLine();
        
        System.out.println("Enter the item price: ");
        itemPrice = scnr.nextInt();
        
        System.out.println("Enter the item quantity: ");
        itemQuantity = scnr.nextInt();
        
        item2.setName(itemName);
        item2.setPrice(itemPrice);
        item2.setQuantity(itemQuantity);
        itemTwoTotal = itemPrice * itemQuantity;
        System.out.println("");
        
        System.out.println("TOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity()
        + " @ $" + item1.getPrice() + " = $" + itemOneTotal);
        System.out.println(item2.getName() + " " + item2.getQuantity()
        + " @ $" + item2.getPrice() + " = $" + itemTwoTotal);
        totalPrice = itemOneTotal + itemTwoTotal;
        System.out.println("");
        
        System.out.println("Total: $" + totalPrice);
        
        
    }
    
}
