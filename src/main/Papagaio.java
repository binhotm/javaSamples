package main;

import abstratos.Animal;

public class Papagaio implements Animal {
	String nome = "PAPAGIO MANCHADO";

	@Override
	public void dormir() {
		// TODO Auto-generated method stub

	}

	@Override
	public String efeitoSonoro() {
		return "Pruuuu..Pruuuu.. Pru";
	}

}
