package section9.lec63;

import java.util.ArrayList;

/**
 * Created by manishgiri on 5/31/17.
 */
public class Branch {

    private String name;

    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    
}
