package main;

import herdeiros.Homen;

public class Hercules extends Homen {

	Hercules() {
		this.setNome("Hercules");
		this.setIdade(34);

		System.out.println(this.getNome() + " foi invocado");
	}

}
