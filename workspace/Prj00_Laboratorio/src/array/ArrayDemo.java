package array;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] voti = new int[5];
		voti[0] = 24;
		voti[1] = 26;
		voti[2] = 25;
		voti[3] = 28;
		voti[4] = 28;
		//              0  1  2  3  4
		int[] voti2 = {25,26,27,28,29};
		
		double totale = 0;
		
		for (int i = 0; i < voti.length; i++) {
			System.out.println("Il valore di i è: " + i);
			//totale = totale + voti2[i];
			totale += voti[i];
			System.out.println("Il voto è: " + voti[i]);
		}
		
		double media = totale / voti.length;
		
		System.out.println("La media aritmetica dei voti è: " + media);

	}

}
