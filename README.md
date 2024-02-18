# GitHubAPI

GitHubAPI is a REST client application that interacts with the GitHub API to fetch repository information for a given user.

## Features

- Fetches all public repositories of a given GitHub user that are not forks.
- For each repository, it fetches the repository name, owner login, and for each branch, its name and last commit SHA.
- Returns a 404 response in a specific format when a non-existing GitHub user is queried.

## Requirements

- Java 21
- Maven

## Dependencies

- Spring Boot Starter Web

## Usage

To use this application, you need to make a GET request to the `/repos/{username}` endpoint, where `{username}` is the GitHub username whose repositories you want to fetch.

## Building

To build the application, navigate to the project directory and run the following command:

```bash
mvn clean install
```

## Running

To run the application, use the following command:

```bash
mvn spring-boot:run
```