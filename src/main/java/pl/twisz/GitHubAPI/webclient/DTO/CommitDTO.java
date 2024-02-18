package pl.twisz.GitHubAPI.webclient.DTO;

import net.karneim.pojobuilder.GeneratePojoBuilder;

@GeneratePojoBuilder
public class CommitDTO {

    private String sha;


    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

}
