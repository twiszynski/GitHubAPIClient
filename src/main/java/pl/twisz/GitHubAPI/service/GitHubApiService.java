package pl.twisz.GitHubAPI.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import pl.twisz.GitHubAPI.controller.exception.GitHubUserNotFoundException;
import pl.twisz.GitHubAPI.model.UserRepositoryInfoDTO;
import pl.twisz.GitHubAPI.webclient.GitHubClient;

import java.util.List;

@Service
public class GitHubApiService {

    private final GitHubClient gitHubClient;

    public GitHubApiService(GitHubClient gitHubClient) {
        this.gitHubClient = gitHubClient;
    }

    public List<UserRepositoryInfoDTO> getUserRepos(String username) {
        try {
            return gitHubClient.getRepositoriesByUsername(username);
        } catch (HttpClientErrorException.NotFound ex) {
            throw new GitHubUserNotFoundException(username);
        }
    }


}
