package pl.twisz.GitHubAPI.webclient.DTO;

import net.karneim.pojobuilder.GeneratePojoBuilder;

@GeneratePojoBuilder
public class OwnerDTO {

    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
