package com.jap.calculator;

import static java.lang.Math.sqrt;

public class ScientificCalculator {

	public double cielOfANumber(float num) throws CalculatorException
	{
		if (num <= 0)


			throw new CalculatorException();

		return Math.ceil(num);

		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call ceil method of Math class and return the value


	}

	public double floorOfANumber(float num) throws CalculatorException {
		if (num <= 0)

			throw new CalculatorException();

		return Math.floor(num);

		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call floor method of Math class and return the value


	}

	public long power(int num1, int num2) throws CalculatorException {
		//if num1 is less than num2 than throw the userdefined exception with proper message
		//else use Math pow method and return the value

		if (num1 <= 0 || num2 <= 0)
			throw new CalculatorException();
		return (long) Math.pow(num1, num2);
	}


	public double squareRoot(int num) throws CalculatorException {
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call sqrt method of Math class and return the value

		if (num <= 0)
			throw new CalculatorException();

		return (double) Math.sqrt(num);
	}

	public static void main(String[] args) {
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		try {
			scientificCalculator.cielOfANumber(10);
		} catch (CalculatorException e) {
			throw new RuntimeException(e);
		}
		//Call all the methods one by one and surround them by try and respective catch blocks.
	}
}