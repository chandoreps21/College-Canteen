
package basic;

import java.util.ArrayList;
import java.util.Scanner;

class FoodItem {
    int id;
    String name;
    double price;

    FoodItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class CollegeCanteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<FoodItem> menu = new ArrayList<>();
        ArrayList<FoodItem> order = new ArrayList<>();

        menu.add(new FoodItem(1, "Sandwich", 50));
        menu.add(new FoodItem(2, "Pizza", 100));
        menu.add(new FoodItem(3, "Burger", 70));
        menu.add(new FoodItem(4, "Tea", 15));
        menu.add(new FoodItem(5, "Coffee", 25));

        int choice;

        do {
            System.out.println("\n===== COLLEGE CANTEEN =====");
            System.out.println("1. View Menu");
            System.out.println("2. Place Order");
            System.out.println("3. View Order");
            System.out.println("4. Generate Bill");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Please enter a number from 1 to 5.");
                sc.nextLine();
                System.out.print("Enter your choice: ");
            }

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n----- FOOD MENU -----");
                    for (FoodItem item : menu) {
                        System.out.println(item.id + ". " + item.name
                                + " - Rs. " + item.price);
                    }
                    break;

                case 2:
                    System.out.println("\nSelect food item ID:");
                    for (FoodItem item : menu) {
                        System.out.println(item.id + ". " + item.name
                                + " - Rs. " + item.price);
                    }

                    System.out.print("Enter food ID: ");
                    if (sc.hasNextInt()) {
                        int id = sc.nextInt();
                        boolean found = false;

                        for (FoodItem item : menu) {
                            if (item.id == id) {
                                order.add(item);
                                System.out.println(item.name
                                        + " added to your order.");
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Invalid food ID.");
                        }
                    } else {
                        System.out.println("Please enter a valid number.");
                        sc.next();
                    }
                    break;

                case 3:
                    if (order.isEmpty()) {
                        System.out.println("Your order is empty.");
                    } else {
                        System.out.println("\n----- YOUR ORDER -----");
                        for (FoodItem item : order) {
                            System.out.println(item.name + " - Rs. "
                                    + item.price);
                        }
                    }
                    break;

                case 4:
                    double total = 0;
                    System.out.println("\n----- BILL -----");

                    for (FoodItem item : order) {
                        System.out.println(item.name + " - Rs. "
                                + item.price);
                        total += item.price;
                    }

                    System.out.println("Total Bill: Rs. " + total);
                    break;

                case 5:
                    System.out.println("Thank you! Visit again.");
                    break;

                default:
                    System.out.println("Invalid choice. Enter 1 to 5.");
            }
        } while (choice != 5);

        sc.close();
    }
}

