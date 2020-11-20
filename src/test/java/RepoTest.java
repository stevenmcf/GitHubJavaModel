import org.junit.Before;

public class RepoTest {

    Repo repo;
    Repo repo1;
    Repo repo2;

    @Before
    public void setUp(){
        repo = new Repo("vue project", "initial commit", RepoType.PRIVATE );
        repo1 = new Repo("python project", "final commit", RepoType.PUBLIC);
        repo2 = new Repo("java project", "thank f thats done", RepoType.PRIVATE);
    }

}
