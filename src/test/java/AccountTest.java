import org.junit.Before;

public class AccountTest {

    Account account;
    Account account1;
    Account account2;

    @Before
    public void setUp(){
        account = new Account("PJ10", "Eddie Vedder", AccountType.PRO);
        account1 = new Account("JL95", "Jonah Lomu", AccountType.FREE);
        account2 = new Account("ImASmashingPumpkin", "Billy Corgan", AccountType.PRO);

    }

}
