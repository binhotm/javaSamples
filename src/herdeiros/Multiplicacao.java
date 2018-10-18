package herdeiros;

import abstratos.Calcular;

public class Multiplicacao implements Calcular {

	@Override
	public double calcular(double a, double b) {
		return a * b;
	}

}
