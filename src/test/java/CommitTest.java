import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    private Commit commit;

    @Before
    public void setUp(){
        commit = new Commit(1, "initial commit");
    }

    @Test
    public void canGetDescription(){
        assertEquals("initial commit", commit.getDescription());
    }

    @Test
    public void hasUniqueID(){
        assertEquals(1, commit.getId());
    }

}
