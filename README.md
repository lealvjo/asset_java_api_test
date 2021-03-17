# asset_java_api_test

Example of how to automate API, using java and behavior-oriented development (BDD)(Cucumber)

- [x] Framework documentation:

      - https://cucumber.io/docs/cucumber/

- [x] Application Programming Interface used for testing

      - https://github.com/lealvjo/scraping_games

# Importing the project

import the project into git: https://github.com/lealvjo/asset_java_api_test

  - [x] Open Maven the project in intellij
  - [x] Expect to load the project and its dependencies

# Running behavior-oriented tests (BDD) Maven

- [x] Open a terminal and type mvn test -DENVIRONMENT={STAGE} 
  
      Environment setting
      
      STAGE = LOCAL
      STAGE = DEV
      STAGE = QA
      
      The environments are the url of the environments configured in the property file

Tests will run successfully :)

# Running behavior-oriented tests (BDD) Runner

- [x] Configure the runner passing the desired environment

      Environment setting
      
      DENVIRONMENT={STAGE}
  
      STAGE = LOCAL
      STAGE = DEV
      STAGE = QA
  
      The environments are the url of the environments configured in the property file

- [x] Go to the Runner class and run as junit

Tests will run successfully :)