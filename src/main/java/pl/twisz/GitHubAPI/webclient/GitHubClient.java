package pl.twisz.GitHubAPI.webclient;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.twisz.GitHubAPI.model.UserRepositoryInfoDTO;
import pl.twisz.GitHubAPI.model.UserRepositoryInfoDTOBuilder;
import pl.twisz.GitHubAPI.webclient.DTO.BranchDTO;
import pl.twisz.GitHubAPI.webclient.DTO.RepositoryDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GitHubClient {
    private static final String API_URL = "https://api.github.com/";
    private final RestTemplate restTemplate = new RestTemplate();



    public List<UserRepositoryInfoDTO> getRepositoriesByUsername(String username) {
        List<UserRepositoryInfoDTO> userRepositoryInfoList = new ArrayList<>();
        List<RepositoryDTO> repositoryDTOS = callGetMethod("users/{username}/repos", new ParameterizedTypeReference<List<RepositoryDTO>>() {}, username)
                .stream()
                .filter(x -> !x.isFork())
                .toList();
        for (RepositoryDTO repositoryDTO : repositoryDTOS) {
            List<BranchDTO> branchDTOS = callGetMethod("repos/{username}/{repository}/branches",
                    new ParameterizedTypeReference<List<BranchDTO>>() {},
                    username,
                    repositoryDTO.getName());

            UserRepositoryInfoDTO userRepositoryInfoDTO = new UserRepositoryInfoDTOBuilder()
                    .withRepositoryName(repositoryDTO.getName())
                    .withOwner(repositoryDTO.getOwner())
                    .withBranches(branchDTOS)
                    .build();

            userRepositoryInfoList.add(userRepositoryInfoDTO);
        }


        return userRepositoryInfoList;

    }


    private <T> T callGetMethod(String url, ParameterizedTypeReference<T> responseType, Object... uriVariables) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

        ResponseEntity<T> responseEntity = restTemplate.exchange(API_URL + url, HttpMethod.GET, entity, responseType, uriVariables);
        return responseEntity.getBody();
    }


}
