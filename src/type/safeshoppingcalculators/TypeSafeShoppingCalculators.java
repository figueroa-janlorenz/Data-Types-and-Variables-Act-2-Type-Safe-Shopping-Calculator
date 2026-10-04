package type.safeshoppingcalculators;

public class TypeSafeShoppingCalculators {

    public static void main(String[] args) {
        int quantity = 3;
        double unitPrice = 67.67;
        String storeName = "ABM Store";
        
        double totalCost = quantity * unitPrice;
        //totalCost shouldn't be a int because it has a decimal value
        
        System.out.println("Shopping Summary");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Cost: " + totalCost);
        
        
    }
    
}
