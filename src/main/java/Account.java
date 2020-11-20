import java.util.ArrayList;

public class Account {

//    instance variables
    private String userName;
    private String name;
    private AccountType accountType;
    private ArrayList<Repo>repos;

//constructor function
    public Account (String userName, String name, AccountType accountType){
        this.userName = userName;
        this.name = name;
        this.accountType = accountType;
        this.repos = new ArrayList<Repo>();
    }
}
