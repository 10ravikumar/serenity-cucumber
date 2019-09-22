package com.example.serenitycucumber.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.serenitycucumber.config.Config;
import cucumber.api.Scenario;
import cucumber.api.java8.En;

/**
 * 
 * @author ravi kumar
 *
 */
@SpringBootTest(classes = Config.class)
public class CucumberHooks implements En{

	@Autowired
	private Context context;
	
	public CucumberHooks(){
		
		Before((Scenario scenario) -> {
			System.out.println("---- before scenario  ----".concat(scenario.getName()));
			context.clearContext();
		});
		
		After((Scenario scenario) -> {
			System.out.println("---- after scenario ----".concat(scenario.getName()));
		});
		
	}
}
