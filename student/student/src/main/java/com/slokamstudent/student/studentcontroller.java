package com.slokamstudent.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentcontroller {
	@Autowired
	private studentRepo repo;

	@PostMapping("savestudent") /* to save the objects */
	public void savestudent(@RequestBody studententity student) {
		System.out.println(student);
		repo.save(student);

	}

	@GetMapping("getstudentbyid/{id}")          /*find by ids with information*/
	public studententity getstudentbyid(@PathVariable Integer id) {
		//System.out.println(id);
		studententity entity=null;
	Optional<studententity>s=	repo.findById(id);
	if(s.isPresent()) {
		System.out.println(s.get());
		entity=s.get();
	}
		
		return entity;
	}
}
/*
 * @PutMapping("updatestudent") update the data public void
 * updatestudent(@RequestBody studententity entity) { repo.save(entity);
 * 
 * }
 * 
 * @DeleteMapping("deletestudent/{id}") delete the data public void
 * deletestudent(@PathVariable Integer id) { repo.deleteById(id);
 * 
 * }
 * 
 * @GetMapping("getbyname/{name}") public List<studententity>
 * getbyname(@PathVariable String name){
 * 
 * return repo.findByName(name);
 * 
 * }
 * 
 * @GetMapping("getbyage/{age}") public List<studententity>
 * getbyage(@PathVariable Integer age){
 * 
 * return repo.findByage(age);
 * 
 * }
 * 
 * @GetMapping("getbyqual/{qual}") public List<studententity>
 * getbyqual(@PathVariable String qual){
 * 
 * return repo.findByqual(qual);
 * 
 * }
 * 
 * @GetMapping("getbyagegretaer/{age}") public
 * List<studententity>greaterthanage(@PathVariable Integer age){ return
 * repo.findByAgeGreaterThan(age);
 * 
 * }
 * 
 * @GetMapping("getbyageless/{age}") public
 * List<studententity>Lessthanage(@PathVariable Integer age){ return
 * repo.findByAgeLessThan(age);
 * 
 * }
 * 
 * @GetMapping("getbyagegretaerthan/{age}") public
 * List<studententity>greaterthanequal(@PathVariable Integer age){ return
 * repo.findByAgeGreaterThanEqual(age);
 * 
 * }
 * 
 * @GetMapping("getbyagelessthanequal/{age}") public
 * List<studententity>Lessthanequal(@PathVariable Integer age){ return
 * repo.findByAgeLessThanEqual(age);
 * 
 * }
 * 
 * @GetMapping("namestartswith/{name}") public
 * List<studententity>namestartswith(@PathVariable String name){ return
 * repo.findBynameStartingWith(name);
 * 
 * }
 * 
 * @GetMapping("descorder/{name}") public
 * List<studententity>descorder(@PathVariable String name){ return
 * repo.findByAgeOrderByLastnameDesc(name);
 * 
 * }
 * 
 * 
 * }
 */
