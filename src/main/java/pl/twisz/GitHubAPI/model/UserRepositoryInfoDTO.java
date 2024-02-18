package pl.twisz.GitHubAPI.model;

import net.karneim.pojobuilder.GeneratePojoBuilder;
import pl.twisz.GitHubAPI.webclient.DTO.BranchDTO;
import pl.twisz.GitHubAPI.webclient.DTO.OwnerDTO;

import java.util.List;

@GeneratePojoBuilder
public class UserRepositoryInfoDTO {

    private String repositoryName;
    private OwnerDTO owner;
    private List<BranchDTO> branches;

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
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
}
