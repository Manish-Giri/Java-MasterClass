package section9;

import java.util.ArrayList;

/**
 * Created by manishgiri on 5/26/17.
 */
public class L57 {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list.");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String newItem) {
        int pos = findItem(newItem);
        if(pos >= 0) {
            modifyGroceryItem(pos, newItem);
        }
    }

    private void modifyGroceryItem(int position, String item) {
        groceryList.set(position, item);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(String item) {
        int pos = findItem(item);
        if(pos >= 0) {
            removeGroceryItem(pos);
        }
    }

    private String removeGroceryItem(int position) {
        String removed = groceryList.get(position);
        groceryList.remove(position);
        return removed;
    }

    public int findItem(String item) {
        return groceryList.indexOf(item);

    }

    public static void main(String[] args) {
        L57 obj = new L57();

    }
}
