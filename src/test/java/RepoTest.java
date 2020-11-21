import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepoTest {

    Repo repo;
    Repo repo1;
    Repo repo2;
    Commit commit1;
    Commit commit2;

    @Before
    public void setUp(){
        repo = new Repo("Pearl Jam", "My band on tour", RepoType.PRIVATE );
        repo1 = new Repo("World Cup '95 Highlight", "I ran over tony underwood", RepoType.PUBLIC);
        repo2 = new Repo("Mellon Collie", "Story of a sad dog", RepoType.PRIVATE);
        commit1 = new Commit(1, "The story's just begun");
        commit2 = new Commit(397683, "Thank F* that's over");
    }
    @Test
    public void hasRepositoryName(){
        assertEquals("Mellon Collie", repo2.getRepoName());
    }

    @Test
    public void hasDescription(){
        assertEquals("My band on tour", repo.getDescription());
    }

    @Test
    public void hasRepositoryType(){
        assertEquals(RepoType.PUBLIC, repo1.getRepoType());
    }
    @Test
    public void canAddCommit(){
        repo1.addCommit(commit1);
        assertEquals(1, repo1.countCommits());
    }

//    get commit by id.
//    if there is a commit. return the data by calling id

    @Test
    public void canGetCommitById(){
        repo.addCommit(commit2);
        assertEquals(commit2, repo.findCommitById(397683));

    }
    }

