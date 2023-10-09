package it.boglia.api;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.boglia.entities.Provincia;
import it.boglia.entities.Regione;
import it.boglia.services.PopolazioneService;

@RestController
@RequestMapping("api")
public class RestCtrl {

	@Autowired
	private PopolazioneService service;
	
	@GetMapping("")
	public Collection<Provincia> getProvince(){
		
		return service.getProvinceMap().values();
	} 
	
	@GetMapping("province/search/{pattern}")
	public List<Provincia> getProvinceByPattern(@PathVariable("pattern") String pattern){
		return service
				.getProvinceMap()
				.values()
				.stream()
				.filter(p -> p.getComune().contains(pattern))
				.toList();
	}
	@GetMapping("province/total/{number}")
	public List<Provincia> getProvinceByPopolazioneTotale(@PathVariable("number") int num){
		return service
					.getProvinceMap()
					.values()
					.stream()
					.filter(p -> p.getTotale() > num)
					.toList();
	}
	

	@GetMapping("regionioggetto")
	public List<Regione> getRegioniOggetto(){
		return service
				.getProvinceMap()
				.values()
				.stream()
				.map(p -> p.getRegione())
				.distinct()
				.map(p -> {
					Regione r = new Regione();
					r.setNome(p);
					return r;
				}).toList();
	}
	
	
	
	@GetMapping("regioni")
	public List<String> getRegioni(){
		return service.getRegioni();
	}
	
	
}
