/**
 * Created by vajrayogini on 2/8/16.
 */
public class Item {
    String name;
    int quantity;
    String category;

    public Item () {  //need blank constructor in parent class

    }

    public Item(String itemName, int quantity) {
        this.name = itemName;
        this.quantity = quantity;
    }
    public static Item createItem (String name, int quantity, String category) throws Exception {
        if (category.equalsIgnoreCase("Fruit")){
            return new Fruit(name, quantity);
        }
        else if (category.equalsIgnoreCase("Vegetables")) {
            return new Vegetables(name, quantity);
        }
        else if (category.equalsIgnoreCase("Meat")) {
            return new Meat(name, quantity);
        }
        else if (category.equalsIgnoreCase("Dairy")) {
            return new Dairy(name, quantity);
        }
        else if (category.equalsIgnoreCase("Bread")) {
            return new Bread(name, quantity);
        }
        else  {
            throw new Exception("Invalid category name");
        }
    }
}
