package array;

public class ScorrereArray {

	public static void main(String[] args) {
		
		//int[] voti = new int[5];
//		int[] voti = new int[] {25,26,27,28,29};
		int[] voti = {25,26,27,28,29};
		
//		for (int i = 0; i < voti.length; i++) {
//			System.out.println("Il voto " + i + " vale " + voti[i]);
//		}
		
//		for (int i = voti.length - 1; i >= 0; i--) {
//			if (  voti[i]  % 2 == 0    )
//				System.out.println("Il voto " + i + " vale " + voti[i]);
//		}

		for (int voto : voti) {
			System.out.println("Il voto " + voto);
		}
	

	}

}
