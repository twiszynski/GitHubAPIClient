package pl.twisz.GitHubAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.twisz.GitHubAPI.model.UserRepositoryInfoDTO;
import pl.twisz.GitHubAPI.webclient.DTO.RepositoryDTO;
import pl.twisz.GitHubAPI.service.GitHubApiService;

import java.util.List;

@RestController
@RequestMapping("/repos")
public class UserController {

    private GitHubApiService gitHubApiService;

    public UserController(GitHubApiService gitHubApiService) {
        this.gitHubApiService = gitHubApiService;
    }

    @GetMapping("/{username}")
    public List<UserRepositoryInfoDTO> getUserRepos(@PathVariable String username) {
        return gitHubApiService.getUserRepos(username);
    }

}
