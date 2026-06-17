class FoodItem {
    private int itemId;
    private String itemName;
    private double price;
    private int quantity; //private isiliye hai ki direct koi change na kar sake, isliye hum getter and setter use karenge)

    //Constructor is use to initialize the object
    // constructor ka kaam hai object ko initialize karna
    // constructor ka naam class ke naam ke jaisa hota hai
    // constructor overloading bhi hota hai, matlab ek class me multiple constructor ho sakte hai with different parameters
    public FoodItem(int itemId, String itemName, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity; 
        
        //this keyword ka use karte hai to refer to the current object, isliye hum this.itemId, this.itemName, this.price, this.quantity use karte hai to refer to the instance variables of the class
        //this ka use hum bas initial karne ke liye karte hai, baad me hum direct itemId, itemName, price, quantity use kar sakte hai without this keyword
    }
    //calculate the total amount for the food item()
    double calculateAmount() {
        return price * quantity;
    }

    void displayItemDetails() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Amount    : " + calculateAmount());
        System.out.println();
    }
}
class Customer {
    int customerId;
    String customerName;
    String mobileNumber;

    // constructor
    Customer(int id, String name, String mobile) {
        customerId = id;
        customerName = name;
        mobileNumber = mobile;
    }

    void displayCustomerDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Mobile Number : " + mobileNumber);
    }
}
public class OnlineFoodDelivery{
    public static void main(String[] args) {

    //yahan pe hamara food items hain,price hain aur quantity hain, to hum ek class bana rahe jiska naam hai FoodItem, jisme hum itemId, itemName, price aur quantity ko define karenge, aur ek method bana rahe calculateAmount() jo price aur quantity ka multiplication karega aur return karega total amount, aur ek method banayenge displayItemDetails() jo item ke details ko print karega.
    FoodItem f1 = new FoodItem(1, "Matar Samosa", 50.0, 2);
    FoodItem f2 = new FoodItem(2, "Paneer Samosa", 60.0, 3);
    FoodItem f3 = new FoodItem(3, "Aloo Samosa", 40.0, 4);
    FoodItem f4 = new FoodItem(4, "Veg Samosa", 45.0, 5);
    FoodItem f5 = new FoodItem(5, "UP Samosa", 70.0, 1);

    //yahan pe hamara customer hai, to hum ek class bana rahe jiska naam hai Customer, jisme hum customerId, customerName aur mobileNumber ko define karenge, aur ek method banayenge displayCustomerDetails() jo customer ke details ko print karega.
    Customer c1 = new Customer(1, "Yash", "1234567890");
    Customer c2 = new Customer(2, "Alice", "0987654321");

    //Customer id Display karne ke liye hum ek method bana rahe hai jiska naam hai displayCustomerDetails() jo customer ke details ko print karega.
    c1.displayCustomerDetails();
    c2.displayCustomerDetails();

    //Food Item Details Display karne ke liye hum ek method bana rahe hai jiska naam hai displayItemDetails() jo item ke details ko print karega.
    f1.displayItemDetails();
    f2.displayItemDetails();
    f3.displayItemDetails();
    f4.displayItemDetails();
    f5.displayItemDetails();
    Double total = f1.calculateAmount() + f2.calculateAmount()
                    + f3.calculateAmount() + f4.calculateAmount() + f5.calculateAmount();

        System.out.println("-------------------");
        System.out.println("Total Bill: " + total);
        System.out.println("-------------------");
    }
}

