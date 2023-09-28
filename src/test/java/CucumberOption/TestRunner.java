package CucumberOption;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/java/Features",
    glue = {"StepDefinition"},
    monochrome = true,
    plugin = {"pretty", "html:target/cucumber.html"}
    
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
