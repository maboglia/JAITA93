package collezioni;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

class Provincia{

	int id;
	String nome;
	boolean capoLuogo;
	
}

class Regione{
	
	int id;
	String nome;
	Set<Provincia> province;
	
	
}

public class ProvaCollezioni {

	public static void main(String[] args) {
		//Liste
		
		List<String> regioni = new ArrayList<>();//new LinkedList<>();//new Vector<>();
		Set<String> regioniUniche = new HashSet<>();//new TreeSet<>();//-> implements Comparable
		Queue<String> regioniCoda = new PriorityQueue<>();//new LinkedList<>();
		
		//    Set    Collection 
		Map<Integer, Regione> regioniMap = new HashMap<>();//new TreeMap<>();//-> implements Comparable
		
		Regione campania = new Regione();
		campania.id = 1;
		campania.nome = "Campania";
		
		Provincia p1 = new Provincia();
		p1.id = 1;
		p1.nome = "Napoli";
		p1.capoLuogo = true;
		
		Provincia p2 = new Provincia();
		p1.id = 2;
		p1.nome = "Salerno";
		p1.capoLuogo = false;

		Regione toscana = new Regione();
		toscana.id = 2;
		toscana.nome = "Toscana";
		
		Provincia p3 = new Provincia();
		p3.id = 3;
		p3.nome = "Firenze";
		p3.capoLuogo = true;
		
		Provincia p4 = new Provincia();
		p4.id = 4;
		p4.nome = "Siena";
		p4.capoLuogo = false;
				
		
		campania.province.addAll(List.of(p1, p2));
		toscana.province.addAll(List.of(p3,p4));
		
		regioniMap.put(campania.id, campania);
		regioniMap.put(toscana.id, toscana);
		
		Set<Integer> keySet = regioniMap.keySet();
		Collection<Regione> values = regioniMap.values();
		
		for(Integer chiave : keySet) {
			System.out.println(regioniMap.get(chiave));
		}
		
		for(Regione r : values) {
			System.out.println(r);
		}
		
		for (  Entry<Integer, Regione> reg  : regioniMap.entrySet()  )   {
			
			
			
		}
		

	}

}
