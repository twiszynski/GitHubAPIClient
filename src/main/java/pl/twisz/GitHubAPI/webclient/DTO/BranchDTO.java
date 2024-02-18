package pl.twisz.GitHubAPI.webclient.DTO;

import net.karneim.pojobuilder.GeneratePojoBuilder;

@GeneratePojoBuilder
public class BranchDTO {
    private String name;
    private CommitDTO commit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CommitDTO getCommit() {
        return commit;
    }

    public void setCommit(CommitDTO commit) {
        this.commit = commit;
    }
}
