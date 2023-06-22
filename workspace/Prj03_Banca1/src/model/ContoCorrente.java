package model;

public class ContoCorrente {

	public Cliente titolare;
	private double saldo;
	
	public ContoCorrente(Cliente titolare) {
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
		System.out.println("Non puoi ritirare " + sommaRichiesta );
		System.out.println("La disponibilità sul conto è di " + this.saldo);
		return 0;
		
	}
	
	public double getSaldo() {//metodo getter
		return this.saldo;
	}
	
	
}
