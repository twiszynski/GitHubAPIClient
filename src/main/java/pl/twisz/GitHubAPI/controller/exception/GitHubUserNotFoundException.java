package pl.twisz.GitHubAPI.controller.exception;

public class GitHubUserNotFoundException extends RuntimeException {
    public GitHubUserNotFoundException(String username) {
        super("Github user '" + username + "' does not exist");
    }
}
