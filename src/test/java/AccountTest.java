import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    Account account;
    Account account1;
    Account account2;
    Repo repo;
    Repo repo1;
    Repo repo2;

    @Before
    public void setUp() {
        account = new Account("Eddie Vedder", "PJ10", AccountType.PRO);
        account1 = new Account("Jonah Lomu", "JL95", AccountType.FREE);
        account2 = new Account("Billy Corgan", "ImASmashingPumpkin", AccountType.PRO);
        repo = new Repo("Pearl Jam", "My band on tour", RepoType.PRIVATE);
        repo1 = new Repo("World Cup '95 Highlight", "I ran over tony underwood", RepoType.PUBLIC);
        repo2 = new Repo("Mellon Collie", "Story of a sad dog", RepoType.PRIVATE);
    }

    @Test
    public void hasUserName() {
        assertEquals("Eddie Vedder", account.getUserName());
    }

    @Test
    public void canChangeUserName() {
        assertEquals("Stone Gossard", account.setUserName("Stone Gossard"));
    }

    @Test
    public void hasAccountName() {
        assertEquals("PJ10", account.getAccountName());
    }

    @Test
    public void hasAccountType() {
        assertEquals(AccountType.PRO, account.getAccountType());
    }

    @Test
    public void hasNoRepos() {
        assertEquals(0, account.countRepos());
    }

    @Test
    public void canAddRepository() {
        account2.addRepo(repo);
        assertEquals(1, account2.countRepos());
    }

    @Test
    public void canFindRepoByName() {
        account.addRepo(repo);
        assertEquals(repo, account.findRepoByName("Pearl Jam"));

    }

    @Test
    public void canUpgradeAccount(){
        assertEquals(AccountType.PRO, account1.setAccountType(AccountType.PRO));
    }

    @Test
    public void canDowngradeAccount(){
        assertEquals(AccountType.FREE, account.setAccountType(AccountType.FREE));
    }
}