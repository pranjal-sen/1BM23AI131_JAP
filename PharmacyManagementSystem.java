import java.util.ArrayList;

/*
7. Consider a small hospital with a pharmacy that needs a simple inventory management system to keep
track of its medications and medical supplies. Each item in the inventory has a unique ID, name, quantity
in stock, and price. The hospital wants functionalities to add new items, update existing items, remove
items, display the list of all items, and search for a specific item by its ID.
 */
class Pharmacy {
    public final int id;
    public final String name;
    public int quantity;
    public double price;
    Pharmacy (int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

public class PharmacyManagementSystem {
    private ArrayList<Pharmacy> inventory = new ArrayList<>();
    // Add new item to inventory
    public void addItem (int id, String name, int quantity, double price) {
        Pharmacy medicine = new Pharmacy(id, name, quantity, price);
        inventory.add(medicine);
    }

    public void updateItem (int id, int quantity, double price) {
        for (Pharmacy product : inventory) {
            if (product.id == id) {
                product.quantity = quantity;
                product.price = price;
            }
        }
    }

    public void deleteItem (int id) {
        inventory.removeIf(item->item.id == id);
    }

    public void displayInventory () {
        System.out.println("Inventory");
        for (Pharmacy item: inventory) {
            System.out.println(item.id + " | " + item.name + " | " + item.quantity + " | " + item.price);
        }
    }

    public Pharmacy searchItem (int id) {
        for (Pharmacy item: inventory) {
            if (item.id == id) {
                return item;
            }
        }
        return null; // Item not found
    }

    public static void main (String[] args) {
        PharmacyManagementSystem ims = new PharmacyManagementSystem();
        ims.addItem(1, "Crocin", 100, 2.5);
        ims.addItem(2, "Calpol", 50, 3.0);
        ims.addItem(3, "Crickmol", 200, 1.0);

        // Display inventory
        ims.displayInventory();

        // Updating an item
        ims.updateItem(1, 90, 2.0); // Updating the price and quantity of crocin

        // Displaying inventory after update
        ims.displayInventory();

        // Searching for an item
        System.out.println("Searching for item with id: 2");
        Pharmacy foundItem = ims.searchItem(2);
        if (foundItem != null) {
            System.out.println("Item found: " + foundItem.name);
        } else {
            System.out.println("Item not found");
        }

        // Removing an item
        ims.deleteItem(2);

        // Displaying inventory after deleting product with id = 2
        ims.displayInventory();
    }
}

/*
OUTPUT
Inventory
1 | Crocin | 100 | 2.5
2 | Calpol | 50 | 3.0
3 | Crickmol | 200 | 1.0
Inventory
1 | Crocin | 90 | 2.0
2 | Calpol | 50 | 3.0
3 | Crickmol | 200 | 1.0
Searching for item with id: 2
Item found: Calpol
Inventory
1 | Crocin | 90 | 2.0
3 | Crickmol | 200 | 1.0
 */
