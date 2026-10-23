# College-Canteen

# College Canteen Management System

## Project Overview
The College Canteen Management System is a console-based Java application that allows users to view the food menu, place orders, view selected items, and generate a bill.

## Features
- View available food items and prices.
- Place an order using the food item ID.
- Add multiple food items to an order.
- View selected order items.
- Generate the total bill.
- Handle invalid menu choices and food IDs.
- Exit the application.

## Food Menu

| ID | Food Item | Price |
|---|---|---|
| 1 | Sandwich | ₹50 |
| 2 | Pizza | ₹100 |
| 3 | Burger | ₹70 |
| 4 | Tea | ₹15 |
| 5 | Coffee | ₹25 |

## Technologies Used
- Java
- ArrayList
- Scanner
- Object-Oriented Programming (OOP)

## Project Structure

```text
CollegeCanteenProject/
└── basic/
    └── CollegeCanteen.java
└── README.md
```

## Requirements
- Java Development Kit (JDK)
- Eclipse IDE or any Java-supported editor

## How to Run

1. Open the project in Eclipse.
2. Create a package named `basic`.
3. Add the `CollegeCanteen.java` file to the package.
4. Run the program.
5. Enter a menu option from 1 to 5.

### Run Using Command Line

Compile the program:

```bash
javac basic/CollegeCanteen.java
```

Run the program:

```bash
java basic.CollegeCanteen
```

## Menu Options

1. View Menu
2. Place Order
3. View Order
4. Generate Bill
5. Exit

## Sample Output

```text
===== COLLEGE CANTEEN =====
1. View Menu
2. Place Order
3. View Order
4. Generate Bill
5. Exit
Enter your choice: 1

----- FOOD MENU -----
1. Sandwich - Rs. 50.0
2. Pizza - Rs. 100.0
3. Burger - Rs. 70.0
4. Tea - Rs. 15.0
5. Coffee - Rs. 25.0
```

## Limitations
- Console-based application.
- No database connectivity.
- Orders are not saved permanently.
- No online payment facility.

## Future Enhancements
- Add a graphical user interface.
- Add quantity selection.
- Integrate a database.
- Add customer details and payment options.

## Author
Created as a Java learning project.
