package test.java.com.numbers.practice.operations;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import main.java.com.numbers.practice.INumbersOperationCalculator;
import main.java.com.numbers.practice.datatypes.Parameter;
import main.java.com.numbers.practice.operations.PINthDigitOperation;

public class PINthDigitOperationTest {

	@Rule
	 public final ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testRunThrowsIllegalArgumentExceptionNumberOfParameters() {
		INumbersOperationCalculator operationPi = new PINthDigitOperation();
		Parameter parameter1 = new Parameter();
		Parameter parameter2 = new Parameter();
		
		exception.expect(IllegalArgumentException.class);
		
		parameter1.setParameter("1.1");
		parameter2.setParameter("1.2");
		
		operationPi.run(parameter1, parameter2);
	}
	
	@Test
	public void testRunThrowsIllegalArgumentException() {
		INumbersOperationCalculator operationPi = new PINthDigitOperation();
		Parameter parameter = new Parameter();
		
		exception.expect(IllegalArgumentException.class);
		
		parameter.setParameter("-1");
		operationPi.run(parameter);
	}

	@Test
	public void testRunThrowsNumberFormatException() {
		INumbersOperationCalculator operationPi = new PINthDigitOperation();
		Parameter parameter = new Parameter();
		
		exception.expect(NumberFormatException.class);
		
		parameter.setParameter("1.1");
		operationPi.run(parameter);
	}
	
	@Test
	public void testRunLengthOfZero() {
		INumbersOperationCalculator operationPi = new PINthDigitOperation();
		Parameter parameter = new Parameter();
		
		parameter.setParameter("0");
		assertEquals(null, "3", operationPi.run(parameter));
	}
	
	@Test
	public void testRunLengthOfTwo() {
		INumbersOperationCalculator operationPi = new PINthDigitOperation();
		Parameter parameter = new Parameter();
		
		parameter.setParameter("2");
		assertEquals(null, "3.12", operationPi.run(parameter));
	}
}
