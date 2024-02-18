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

## Downloading and Running the Project

### Cloning the Repository

1. Clone the repository using the command `git clone <repository-url>`.
2. Navigate to the project directory using the command `cd <project-name>`.
3. Run the command `mvn clean install` to build the project.
4. Start the application using the command `mvn spring-boot:run`.

### Downloading as a ZIP Archive

1. Download the project as a ZIP archive.
2. Extract the archive at your chosen location.
3. Open a terminal and navigate to the project directory.
4. Run the command `mvn clean install` to build the project.
5. Start the application using the command `mvn spring-boot:run`.