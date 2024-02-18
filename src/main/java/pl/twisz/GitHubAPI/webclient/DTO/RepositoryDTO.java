package pl.twisz.GitHubAPI.webclient.DTO;

import net.karneim.pojobuilder.GeneratePojoBuilder;

import java.util.List;

@GeneratePojoBuilder
public class RepositoryDTO {

    private String name;
    private OwnerDTO owner;
    private List<BranchDTO> branches;
    private boolean fork;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OwnerDTO getOwner() {
        return owner;
    }

    public void setOwner(OwnerDTO owner) {
        this.owner = owner;
    }

    public List<BranchDTO> getBranches() {
        return branches;
    }

    public void setBranches(List<BranchDTO> branches) {
        this.branches = branches;
    }

    public boolean isFork() {
        return fork;
    }

    public void setFork(boolean fork) {
        this.fork = fork;
    }
}
