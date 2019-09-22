package com.example.serenitycucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.serenitycucumber.config.Config;

/**
 * 
 * @author ravi kumar
 * This is a runner file where we specify the cucumber options parameter value.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "json:build/reports/cucumber.json"},
        features = "src/e2e/resources/features/",
        snippets = SnippetType.CAMELCASE,
        glue = {"com.example.serenitycucumber"}, // packages used for glue code, looked up in the classpath
        tags = {"not @manual"} // security
)
@SpringBootTest(classes = Config.class)
public class TestRunner{
	
	
	
}
