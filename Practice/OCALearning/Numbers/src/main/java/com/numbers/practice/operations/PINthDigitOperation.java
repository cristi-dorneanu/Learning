package main.java.com.numbers.practice.operations;

import main.java.com.numbers.practice.INumbersOperationCalculator;
import main.java.com.numbers.practice.datatypes.Parameter;
import main.java.com.numbers.practice.datatypes.Result;

public class PINthDigitOperation implements INumbersOperationCalculator{

	private static final int MAX_LENGTH_VALUE = 128;
	
	@Override
	public Result run(Parameter... parameters) throws IllegalArgumentException, NumberFormatException{
		Result res = new Result();
		
		if(parameters == null || parameters.length != 1)
		{
			throw new IllegalArgumentException("Specify only the length parameter");
		}
		
		String digitNumberStr = parameters[0].getParameter();
		int numberOfDigits = Integer.parseInt(digitNumberStr);
		
		if(numberOfDigits < 0 || numberOfDigits > MAX_LENGTH_VALUE)
		{
			throw new IllegalArgumentException("Invalid length parameter must be a value between 0 and " + MAX_LENGTH_VALUE);
		}
		
		String operationValue = getOperationValue(numberOfDigits);
		res.setResult(operationValue);
		
		return res;
	}

	private String getOperationValue(int numberOfDigits) {
		String value = "";
		double piValue = Math.PI;
		
		value += piValue % 10;
		
		if(numberOfDigits > 0)
		{
			value += ".";
		}
		
		while(numberOfDigits > 0)
		{
			piValue *= 10;
			value += piValue % 10;
			
			numberOfDigits--;
		}
		
		return value;
	}
	
}
