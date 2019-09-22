package com.example.serenitycucumber.stepdefinition;

import static org.junit.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.serenitycucumber.steps.CalculatorSteps;
import com.example.serenitycucumber.util.Context;

import cucumber.api.java8.En;
import net.serenitybdd.core.Serenity;

/**
 * 
 * @author ravi kumar
 * This is a step definition class for calculator functionality.
 *
 */
public class CalculatorStepdefs extends BaseStepDefinition implements En {
	
	@Autowired
	CalculatorSteps calculatorStep;
	
	@Autowired
	private Context context;

	public CalculatorStepdefs() {

		Given("^I have a Calculator$", this::initializeCalculator);
		When("^I add (\\d+) and (\\d+)$", this::testAdd);
		Then("^the sum should be (\\d+)$", this::validateResult);
	}

	private void initializeCalculator() {
		calculatorStep.setUpCalculator();
	}

	private void testAdd(final int firstNumber, final int secondNumber) throws Throwable {
		final Integer actualSumValue = calculatorStep.whenAddTwoNumbers(firstNumber, secondNumber);
		Serenity.recordReportData().withTitle("Actual add result").andContents(actualSumValue.toString());
		context.setValue("actualSum",actualSumValue);

	}

	private void validateResult(final int result) throws Throwable {
		assertEquals("The expected sum does not equal the actual sum", result, (int)context.getValue("actualSum"));
	}
}
