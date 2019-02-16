package com.shir.calculator;

public class Calculator {

	private static int result = 0;

	public static int getResult() {
		return result;
	}

	public void performOpertion(String st, int num) {
	    OpertionType opertion = OpertionType.chackOpertionType(st);

		switch (opertion) {
		case ADD:

		{
			Add add = new Add();
			setResult((add.exceute(Calculator.getResult(), num)));
		}
			break;

		case SUBTRACT: {
			Subtract sub = new Subtract();
			setResult((sub.exceute(Calculator.getResult(), num)));
		}
			break;

		case MULTIPLY: {
			Multiply mul = new Multiply();
			setResult((mul.exceute(Calculator.getResult(), num)));
		}
			break;
		case DIVIDE: {
			Divide div = new Divide();
			setResult((div.exceute(Calculator.getResult(), num)));
		}
			break;

		case QUIT:
			System.out.println("end");
			break;
		case EROR:
			System.out.println(st + " its not an operetor");
			
			System.out.println(getResult());
			

		}
	}

	public void setResult(int result) {
		Calculator.result = result;
	}

}
