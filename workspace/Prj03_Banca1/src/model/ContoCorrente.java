package model;

public class ContoCorrente {

	private static int contatore = 1;
	
	private int numero;
	public Cliente titolare;
	private double saldo;

	public ContoCorrente(Cliente titolare) {
		this.numero = contatore++;
		this.titolare = titolare;
		this.saldo = 0;
	}

	public void versamento(double sommaVersata) {
		this.saldo += sommaVersata;
	}

	public double prelievo(double sommaRichiesta) {

		if (sommaRichiesta < this.saldo) {
			this.saldo -= sommaRichiesta;
			return sommaRichiesta;
		}
		System.out.println("Non puoi ritirare " + sommaRichiesta);
		System.out.println("La disponibilità sul conto è di " + this.saldo);
		return 0;

	}

	public double getSaldo() {// metodo getter
		return this.saldo;
	}

	public String report() {
		return "Conto corrente n. " + this.numero 
				+ "\n" + "titolare: " + this.titolare.nome
				+ "\n" + "saldo: " + this.saldo;
	}
}
