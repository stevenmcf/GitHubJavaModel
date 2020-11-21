import java.util.ArrayList;

public class Repo {

    private String name;
    private String description;
    private RepoType repoType;
    private ArrayList<Commit> commits;

    public Repo(String name, String description, RepoType repoType) {
        this.name = name;
        this.description = description;
        this.repoType = repoType;
        this.commits = new ArrayList<Commit>();

    }

    public String getRepoName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public RepoType getRepoType() {
        return this.repoType;
    }

    public void addCommit(Commit commit) {
        this.commits.add(commit);
    }

    public int countCommits() {
        return this.commits.size();
    }

//
//    }
//    public Commit findCommitById(int commits} { //The class name is Block
//        for(Commit commit : commits) {
//        if(block.x == x {
//        return block;
//        }
//        }
//
//        return null;

    public Commit findCommitById(int id) {
        Commit foundCommit = null;
        for (Commit commit : this.commits) {
            if (commit.getId() == id) {
                foundCommit = commit;
            }
        }
        return foundCommit;
    }
}


