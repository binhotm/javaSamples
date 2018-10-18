package herdeiros;

import abstratos.Calcular;

public class Soma implements Calcular {

	private double result;

	public Soma(double a, double b) {
		this.result = calcular(a, b);
	}

	@Override
	public double calcular(double a, double b) {
		return a + b;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

}
