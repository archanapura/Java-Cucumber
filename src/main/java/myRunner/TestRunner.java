package myRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features= "Features",
        glue= {"stepDef"},
        plugin={"usage","html:target/cucumber-html-report","json:target/cucumber.json", "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"}

)public class TestRunner {

}
