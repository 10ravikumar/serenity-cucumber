package com.example.serenitycucumber.stepdefinition;

import org.junit.ClassRule;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.serenitycucumber.config.Config;

import net.serenitybdd.junit.spring.integration.SpringIntegrationClassRule;

/**
 * 
 * @author ravi kumar
 * This is a base step definition class used/extends by every other step definition class.
 *
 */

@SpringBootTest(classes = Config.class)
public abstract class BaseStepDefinition {
	
	 @ClassRule
	    public static SpringIntegrationClassRule springIntegrationClassRule = new SpringIntegrationClassRule();


}
