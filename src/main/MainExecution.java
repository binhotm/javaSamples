package main;

import abstratos.Calcular;
import herdeiros.Multiplicacao;
import herdeiros.Pessoa;
import herdeiros.Soma;

public class MainExecution {

	public static void main(String[] args) {

		JoanaDark joana = new JoanaDark();
		Hercules hercules = new Hercules();

		Pessoa jose = new Pessoa();
		jose.setNome("Jose");
		jose.setIdade(18);

		Pessoa ana = new Pessoa();
		ana.setNome("Ana");

		hercules.batalhar(joana);

		Papagaio papa = new Papagaio();
		System.out.println(papa.efeitoSonoro());

		Calcular calc = new Soma(2D, 4D);
		Calcular calc2 = new Multiplicacao();

		System.out.println(calc.calcular(2D, 3D));

	}

}
