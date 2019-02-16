package com.shir.calculator;

public enum OpertionType {
	ADD, SUBTRACT, MULTIPLY, DIVIDE, QUIT,  EROR;

	public static OpertionType chackOpertionType(String st) {

		switch (st) {
		case "+ ": {

			// Add ad = new Add();
			// newResult = (ad.exceute(Calculator.getResult(), num));
			return ADD;

		}

		case "-": {

			return SUBTRACT;
		}

		case "*": {

			return MULTIPLY;

		}

		case "/": {

			return DIVIDE;

		}

		case "quit":

			return QUIT;

		// catch exception,in case of wrong operator.

		}
		return EROR;

	}
}
