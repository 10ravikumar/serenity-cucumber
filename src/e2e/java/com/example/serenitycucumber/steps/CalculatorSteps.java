package com.example.serenitycucumber.steps;

import com.example.serenitycucumber.Calculator;

/**
 * 
 * @author ravi kumar
 *
 */
public class CalculatorSteps {

	private Calculator calculator;	
	
	public void setUpCalculator() {
		this.calculator = new Calculator();
	}

	public Integer whenAddTwoNumbers(final int firstNumber, final int secondNumber) {
		return calculator.add(firstNumber, secondNumber);

	}



}
