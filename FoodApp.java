import java.util.*;

class FoodApp {
    static Scanner sc = new Scanner(System.in);
    float Chicken_Biryani = 100;
    float Mutton_Biryani = 210;
    float Paneer_Tikka = 150;
    float Veg_Biryani = 180;

    float Chicken_BiryaniBill(int Quantity) {
        return Chicken_Biryani * Quantity;
    }

    float Mutton_BiryaniBill(int Quantity) {
        return Mutton_Biryani * Quantity;
    }

    float Paneer_TikkaBill(int Quantity) {
        return Paneer_Tikka * Quantity;
    }

    float Veg_BiryaniBill(int Quantity) {
        return Veg_Biryani * Quantity;
    }
}

class Food extends FoodApp {
    void order() {
        float totalBill = 0; // Initialize total bill to 0

        System.out.println("Welcome to FoodApp!");
        while (true) {
            System.out.println("Select an item to order:");
            System.out.println("1. Chicken Biryani");
            System.out.println("2. Mutton Biryani");
            System.out.println("3. Paneer Tikka");
            System.out.println("4. Veg Biryani");
            System.out.println("5. Done Ordering");

            int choice = sc.nextInt();

            if (choice == 5) {
                break; // Exit the loop when the user is done ordering
            }

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            float itemBill = 0;

            switch (choice) {
                case 1:
                    itemBill = Chicken_BiryaniBill(quantity);
                    break;
                case 2:
                    itemBill = Mutton_BiryaniBill(quantity);
                    break;
                case 3:
                    itemBill = Paneer_TikkaBill(quantity);
                    break;
                case 4:
                    itemBill = Veg_BiryaniBill(quantity);
                    break;
                default:
                    System.out.println("Invalid option");
            }

            totalBill += itemBill; // Add the item's bill to the total bill
            System.out.println("Item Bill: " + itemBill);
        }

        Bill(totalBill); // Calculate and display the total bill after ordering
    }

    void Bill(float amt) {
        if (amt >= 1000) {
            System.out.println("Your Actual Bill is: " + amt);
            System.out.println("After Discount: " + (amt - 200));
        } else
            System.out.println("Bill is " + amt);
    }
}

class User extends Food {
    public static void main(String[] args) {
        User member = new User();
        member.order();
    }
}
