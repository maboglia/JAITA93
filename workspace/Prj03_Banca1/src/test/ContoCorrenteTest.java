package test;

import model.Cliente;
import model.ContoCorrente;

public class ContoCorrenteTest {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("mauro");
		
		ContoCorrente cc1 = new ContoCorrente(c1);
		
		cc1.versamento(1000);
		
		cc1.prelievo(500);
		
		cc1.prelievo(250);
		
		System.out.println(cc1.getSaldo());
		

	}

}
