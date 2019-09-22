package com.example.serenitycucumber.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.serenitycucumber.steps.CalculatorSteps;
import com.example.serenitycucumber.util.Context;

/**
 * 
 * @author ravi kumar
 *
 * This is a test configuration file where we placed all the bean. 
 */
@Configuration
public class Config {
	
	
	@Bean
	@Qualifier("getCalculatorStep")
	public CalculatorSteps getCalculatorStep() {
		return new CalculatorSteps();
	}
	
	@Bean
	@Qualifier("getContext")
	public Context getContext() {
		return new Context();
	}

}
