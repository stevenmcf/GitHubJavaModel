import java.util.ArrayList;

public class Commit extends ArrayList<Commit> {

    private int id;
    private String description;

    public Commit(int id, String description){
        this.id = id;
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public int getId(){
        return this.id;
    }

}
