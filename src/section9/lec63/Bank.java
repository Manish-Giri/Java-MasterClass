package section9.lec63;

import java.util.ArrayList;

/**
 * Created by manishgiri on 6/1/17.
 */
public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name)  {
        this.name = name;
        this.branches = new ArrayList<>();
    }
}
