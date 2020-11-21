import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    private Commit commit;

    @Before
    public void setUp(){
        commit = new Commit(1, "The story's just begun");;
    }

    @Test
    public void canGetDescription(){
        assertEquals("The story's just begun", commit.getDescription());
    }

    @Test
    public void hasUniqueID(){
        assertEquals(1, commit.getId());
    }

}
