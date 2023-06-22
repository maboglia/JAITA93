package test;

import model.Cliente;
import model.ContoCorrente;

public class ContoCorrenteTest {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("gennaro");
		
		ContoCorrente cc1 = new ContoCorrente(c1);
		ContoCorrente cc2 = new ContoCorrente(c1);
		
		cc1.versamento(1000);
		cc2.versamento(2000);
		
		
		cc1.prelievo(500);
		
		cc1.prelievo(250);
		
		cc2.prelievo(500);
		
		System.out.println(cc1.report());
		System.out.println(cc2.report());

	}

}
