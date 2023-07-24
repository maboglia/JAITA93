package interfacce;

import java.io.Serializable;

public class NegozioAlimentari extends Negozio implements ContrattoAlimenti, Serializable {

	@Override
	public void conservazione() {
		System.out.println("Conservo in frigorifero");
		
	}

}
