Selenium Automation Framework for Web Applications

Overview
This is a robust Selenium Automation Framework designed for automating web applications. The framework supports dynamic data-driven testing, reusable utilities, and seamless integration with CI/CD tools like Jenkins. It is designed to be modular, scalable, and easy to maintain.
________________________________________
1. Key Features
•	Automates End-to-End Testing: Handles complex workflows for web applications with ease.
•	Reusable Components: Includes utilities for actions like waits, data driven, Page Object Model, Test Listener, Base Test for driver setup and teardown
•	Dynamic Data-Driven Testing: Leverages JSON files and TestNG Data Provider for flexible and scalable test scenarios.
•	Modular Design with Page Object Model (POM): Ensures a clean, scalable, and maintainable project structure.
•	Comprehensive Test Coverage: Automates scenarios such as alerts, frames, dropdowns, file uploads, window authentication popups, and finding broken links using soft assertions.
•	TestNG Integration: Enables parallel test execution and detailed reporting for efficient testing.
•	Maven Dependency Management: Simplifies builds, test executions, and library management.
•	CI/CD Ready: Fully integrated with Jenkins pipelines for automated build and test execution.
•	Version Control with GitHub: Ensures streamlined collaboration and version management.
•	Screenshot Capture: Automatically captures screenshots on test success or failure to assist in debugging.
•	Soft Assertions for Validation: Provides robust validation mechanisms without stopping test execution.
________________________________________
2. Prerequisites
Tools and Software
Step 1: Java Development Kit (JDK)
•	Install JDK 8 or above from the Java SE Downloads.
•	Add JAVA_HOME to your system environment variables.
Step 2: Install Maven
•	Download and install Maven from Maven Downloads.
•	Verify installation:
Command: mvn -v
Step 3: Install ChromeDriver
•	Download the correct ChromeDriver version for your browser from ChromeDriver Downloads.
•	Place the driver in a known directory (e.g., C:\Automation\Drivers\chromedriver.exe).
Step 4: Install Jenkins
•	Download and install Jenkins from the Jenkins Official Site.
•	Add Maven and TestNG plugins to Jenkins.
________________________________________
3. Framework Setup
Step 1: Clone the Repository
   git clone <your-repository-url>
   cd AutomationFramework
Step 2: Install Dependencies
    Command: mvn clean install
Step 3: Configure Test Data
•	Place JSON data files in the specified location: src/test/java/WebApplication/AutomationFramework/jsondata/.
Step 4: Run Tests
•	Execute all tests using Maven by updating sure-fireplugin details:
    Command: mvn test
•	Execute a specific TestNG suite by configuring maven build configuration with testNG Xml details:
Command: mvn test -DsuiteXmlFile=testng.xml
________________________________________
4. Project Structure
AutomationFramework/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── WebApplication/
│   │           ├── AutomationFramework/
│   │           │   ├── BaseTest.java                 # WebDriver setup and teardown
│   │           │   ├── ActionsPageObjectModelPage.java  # Page Object Model for Actions
│   │           │   ├── DataFromFileToHashMapWeb.java # JSON to HashMap utility
│   │           │   ├── ReusableWaitMethods.java      # Custom wait methods
│   │           │   └── TestListener.java            # Listener for screenshots
│   ├── test/
│       └── java/
│           ├── WebApplication/
│           │   ├── AutomationFramework/
│           │   │   ├── ActionsTest_Mutirun_jsondata.java   # JSON-based data-driven test
│           │   │   ├── Alerts.java                        # Alerts handling test
│           │   │   ├── UIDropdownpractise.java            # Dropdown automation test
│           │   │   ├── WindowHandles.java                 # Window handles test
│           │   │   ├── SeleniumnewFeature_Openingwebpageinnewwindowortab.java # Selenium features
│           │   │   └── (Other Test Files)
├── testng.xml                    # TestNG suite configuration
├── pom.xml                       # Maven configuration file
└── README.md                     # Framework documentation
________________________________________
5. Test Execution
TestNG Suite Execution:
•	Use the testng.xml file to define test classes and execute:
Command: mvn test -DsuiteXmlFile=testng.xml
Maven Commands:
•	Clean the project:
Command: mvn clean
•	Execute all tests:
   Command: mvn test
•	Run a specific test class:
Command: mvn -Dtest=<TestClassName> test
________________________________________
6. Jenkins Integration
Step 1: Install Jenkins
•	Download and install Jenkins from Jenkins Downloads.
•	Start Jenkins:
    java -jar jenkins.war
Step 2: Configure Jenkins Pipeline
1.	Add your GitHub repository under "Source Code Management."
2.	Add a Maven build step with the following commands:
o	Clean:
    mvn clean
o	Run tests:
   Command: mvn test -DsuiteXmlFile=testng.xml
________________________________________
7. Highlights of the Framework
•	Reusable Components: Utilities for actions like waits, data driven, Page Object Model, Test Listener, for Screenshots Capture, Base Test for driver setup and teardown
•	Data-Driven Testing: Dynamically fetches test data from JSON files.
•	Comprehensive Test Coverage: Handles scenarios like alerts, actions, frames, reusable utilities of waits, Fluent wait, scroll, window authentication popup, finding broken links on the page using soft assertions, dropdowns, file uploads, and window handling.
•	CI/CD Ready: Seamless integration with Jenkins pipelines.
________________________________________
8. Future Enhancements
•	Add Detailed Reporting: Use Extent Reports or Allure Reports for enhanced reporting.
•	Parallel Execution: Configure TestNG for parallel execution to optimize runtime.
•	Cloud Testing: Integrate with platforms like Browser Stack or Sauce Labs for cross-browser testing.
•	Advanced Logging: Incorporate Log4j for better traceability and debugging.
________________________________________

