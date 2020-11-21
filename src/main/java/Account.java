import java.util.ArrayList;

public class Account {

//    instance variables
    private String userName;
    private String accName;
    private AccountType accountType;
    private ArrayList<Repo>repos;

//constructor function
    public Account (String userName, String accName, AccountType accountType){
        this.userName = userName;
        this.accName = accName;
        this.accountType = accountType;
        this.repos = new ArrayList<Repo>();
    }

    public String getUserName(){
        return this.userName;
    }

    public String getAccountName(){
        return this.accName;
    }

    public AccountType getAccountType(){
        return this.accountType;
    }

    public void addRepo(Repo repo){
        this.repos.add(repo);
    }

    public int countRepos(){
        return this.repos.size();
    }


}
