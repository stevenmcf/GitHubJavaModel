import java.util.ArrayList;

public class Account {

    private String userName;
    private String name;
    private AccountType accountType;
    private ArrayList<Repo>repos;


    public Account (String userName, String name, AccountType accountType){
        this.userName = userName;
        this.name = name;
        this.accountType = accountType;
        this.repos = new ArrayList<Repo>();
    }
}
