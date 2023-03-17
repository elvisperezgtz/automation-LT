# Lean Tech Challenge Automation Project 
This project is a test automation framework to complete the challenge from Lean Tech

## Design Patterns

This project utilizes the Screenplay design pattern. Screenplay is a pattern that focuses on the actions that an actor (i.e., user) can perform on the application. This design pattern abstracts the implementation details of the application, making it easier to maintain and scale.

## Testing Framework

The testing framework used in this project is Serenity BDD. Serenity BDD is an open-source library that provides an easy-to-use framework for creating automated acceptance tests. It offers features such as test reporting, test result tracking, and test coverage analysis.

## Maven

Maven is a build automation tool used in this project. It helps manage the build process, including the compilation, testing, and packaging of the project.

## Java 17

This project is built with Java 17. Java 17 offers features such as sealed classes, pattern matching for instanceof, and improved switch expressions, making it a great choice for developing modern applications.

## Project Structure

Por supuesto, aquí tienes el código del archivo README.md para un proyecto de automatización construido con Maven, Java 17, Serenity BDD y el patrón de diseño Screenplay:

vbnet
Copy code
# Automation Project using Maven, Java 17, Serenity BDD, and Screenplay Pattern

This project is a test automation framework built with Maven, Java 17, Serenity BDD, and the Screenplay design pattern. The framework is designed to provide a scalable, maintainable, and reusable way of automating tests.

## Getting Started

To get started with this project, follow these steps:

1. Clone the project to your local machine.
2. Open the project in your preferred IDE.
3. Ensure you have Java 17 installed on your machine.
4. Ensure you have Maven installed and configured on your machine.
5. Run the following command to install the required dependencies:

```mvn clean verify```

## Design Patterns

This project utilizes the Screenplay design pattern. Screenplay is a pattern that focuses on the actions that an actor (i.e., user) can perform on the application. This design pattern abstracts the implementation details of the application, making it easier to maintain and scale.

## Testing Framework

The testing framework used in this project is Serenity BDD. Serenity BDD is an open-source library that provides an easy-to-use framework for creating automated acceptance tests. It offers features such as test reporting, test result tracking, and test coverage analysis.

## Maven

Maven is a build automation tool used in this project. It helps manage the build process, including the compilation, testing, and packaging of the project.

## Java 17

This project is built with Java 17. Java 17 offers features such as sealed classes, pattern matching for instanceof, and improved switch expressions, making it a great choice for developing modern applications.

## Project Structure


- `src/main/java`: This directory contains the main source code of the project.
    - `started`: This package is the root package of the project.
 
- `src/test/java`: This directory contains the test source code of the project.
    - `started`: This package is the root package of the project.
        - `runners`: This package contains the test runners of the project.
        - `stepdefinitions`: This package contains the step definition classes of the project.
        - `tasks`: This package contains the test tasks classes of the project.
        - `userinterfaces`: This package contains the test user interfaces classes of the project.
        - `models`: This package contains the model classes of the project.
        - `tasks`: This package contains the tasks classes of the project.
        - `userinterfaces`: This package contains the user interfaces classes of the project.
        - `utils`: This package contains the utility classes of the project.
    - `resources`: This package contains all the resources used in the project.
      - `features`: This package contains all the .feature files.
      - `porperties`: This package contains all the properties files.
      - `serenity.conf`: This file contains configurations like capabilities, environments, etc.
      

## Contributing

If you would like to contribute to this project, please follow these steps:

1. Fork the project to your own repository.
2. Create a new branch with your changes.
3. Submit a pull request to merge your changes into the main branch.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
