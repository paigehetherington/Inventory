import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by vajrayogini on 2/8/16.
 */
public class Inventory {
    public static void main(String[] args) {
        ArrayList<Item> inventoryList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> userInfo = new HashMap(); //create hashmap for user info (username, password)
        userInfo.put("Paige", "1234");
        userInfo.put("Doug", "5678");
        userInfo.put("Keaton", "7890");
        userInfo.put("Zach", "3456");
while (true) {
    System.out.println("What is your username?");
    String username = scanner.nextLine();
    if (userInfo.containsKey(username)) {
        System.out.println("What is your password?");
        String password = scanner.nextLine();
        if (userInfo.containsValue(password)) {
            System.out.println("Welcome");
            break; //sends it to rest of code
        } else {
            System.out.println("Password Incorrect, Please try again");
        }

    } else {
        System.out.println("Username not found");
    }
}

        while (true) {
            int lineNumber = 1; //set value to start numbering at 1
            for (Item i : inventoryList) { //for each item i in arraylist print this (see below)
                System.out.println(lineNumber + ". " +i.itemName + " " + i.quantity);
                lineNumber++; //line +1

            }


                System.out.println("");
                System.out.println("1. Create new item");
                System.out.println("2. Remove item");
                System.out.println("3. Update quantity");
            System.out.println("4. Logout");
                System.out.println("Which option would you like?");


                String option = scanner.nextLine();

                if (option.equals("1")) {
                    System.out.println("Which item would you like to create?");
                    String text = scanner.nextLine();
                    System.out.println("What is the quantity?");
                    String quantity = scanner.nextLine();
                    int quantNum = Integer.valueOf(quantity); //type conversion string to int
                    Item item = new Item(text, quantNum);
                    inventoryList.add(item);
                } else if (option.equals("2")) {
                    System.out.println("Which item would you like to remove?");
                    int num = Integer.valueOf(scanner.nextLine()); //converted type in one line by using scanner.nextLine as string

                    inventoryList.remove(num - 1);

                } else if (option.equals("3")) {
                    System.out.println("Which item would you like to update the quantity?");
                    int num = Integer.valueOf(scanner.nextLine());
                    Item itemToBeUpdated = inventoryList.get(num - 1);
                    System.out.println("What is the new quantity?");
                    int newQuant = Integer.valueOf(scanner.nextLine());
                    itemToBeUpdated.quantity = newQuant;
                    inventoryList.add(num - 1, itemToBeUpdated);


                }
                else if (option.equals("4")) {
                    System.out.println("Goodbye");
                }
            else {
                    System.out.println("Invalid response");
                }


            }



        }
    }



/* Create a class with a main method.
Create a variable to store the inventory items.
Print out the inventory items and then list the options.
If the user enters 1, let them create a new item by entering its name.
If the user enters 2, let them remove an item by its number.
if the user enters 3, let them update the quanitity of that item.
Optional: Create a login system with a few hard-coded usernames and passwords.*/

   /* 1. [10] Apples
    2. [5] Pears
    3. [7] Bananas
    Options:
            [1] Create a new item
    [2] Remove an item
    [3] Update an item's quantity*/
