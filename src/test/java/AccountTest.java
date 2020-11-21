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
    public void setUp(){
        account = new Account("Eddie Vedder", "PJ10", AccountType.PRO);
        account1 = new Account("Jonah Lomu", "JL95", AccountType.FREE);
        account2 = new Account("Billy Corgan", "ImASmashingPumpkin", AccountType.PRO);
        repo = new Repo("Pearl Jam", "My band on tour", RepoType.PRIVATE );
        repo1 = new Repo("World Cup '95 Highlight", "I ran over tony underwood", RepoType.PUBLIC);
        repo2 = new Repo("Mellon Collie", "Story of a sad dog", RepoType.PRIVATE);
    }
    @Test
    public void hasUserName(){
        assertEquals("Eddie Vedder", account.getUserName());
    }

//    @Test
//    public void hasUserName(){
//        assertEquals("Jonah Lomu", account1.getUserName());
//    }
//
//    @Test - why does this test fail when trying to run more than once but assertEquals is for the different set-ups above ?
//    public void hasUserName(){
//        assertEquals("Billy Corgan", account2.getUserName());
//    }

    @Test
    public void hasAccountName(){
        assertEquals("PJ10", account.getAccountName());
    }

//    @Test
//    public void hasAccountName(){
//        assertEquals("JL95", account1.getAccountName());
//    }
//
//    @Test
//    public void hasAccountName(){
//        assertEquals("Story of a sad dog", account2.getAccountName());
//    }

    @Test
    public void hasAccountType(){
        assertEquals(AccountType.PRO, account.getAccountType());
    }


    @Test
    public void canAddRepository(){
        account2.addRepo(repo2);
        assertEquals(1, account2.countRepos() );
    }


}
