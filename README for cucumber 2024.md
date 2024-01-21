**Step 1: Clone the Project**

Open Eclipse IDE.

Clone the Git project by navigating to File > Import > Git > Projects from Git > Existing local repository > Select your repository.

**Step 2: Convert to Maven Project and Add Dependencies**

Right-click on the project name.

Choose "Configure" and select "Convert to Maven Project."

Locate the pom.xml file.

**Step 3: Add Cucumber Dependencies**

Inside the <dependencies> section of the pom.xml, add the following dependencies:
xml
Copy code
<dependencies>
    <!-- Cucumber Dependencies -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.2.1</version> <!-- Use the latest version available -->
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>7.2.1</version> <!-- Use the latest version available -->
        <scope>test</scope>
    </dependency>
    
    <!-- JUnit Dependency -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.1</version> <!-- Use the latest version available -->
        <scope>test</scope>
    </dependency>
</dependencies>
Save the pom.xml file.

**Step 4: Clean and Install Dependencies**

Right-click on the project.

Choose "Run As" > "Maven Clean" to clean the project.

Right-click on the project again.

Choose "Run As" > "Maven Install" to download and install the dependencies.

**Step 5: Create Feature File**

Right-click on src/test/resources.

Choose New > Folder to create a folder named features.

Inside the features folder, create a new file with a .feature extension (e.g., sample.feature).

Write Gherkin syntax for your test scenarios.

**Step 6: Create Step Definition**

Right-click on src/test/java.

Choose New > Package to create a package (e.g., stepdefinitions).

Inside the package, create a new class for your step definitions.

**Step 7: Run Feature File**

Right-click on the feature file.

Choose "Run As" > "Cucumber Feature" to run your scenarios.

**Step 8: Create Cucumber Runner**

Create a Cucumber runner class in the src/test/java directory.

Annotate the runner class with @RunWith(Cucumber.class) and specify the features, glue, and plugins.

java
Copy code
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features", glue = {"stepdefinitions"}, plugin = {"pretty","junit:target/JUnitreports/reports.xml"})

public class CucumberTestRunner {
}

Right-click on the runner class.

Choose "Run As" > "JUnit Test" to execute your Cucumber scenarios.

These steps should guide you through setting up and running a Cucumber project in Eclipse.





