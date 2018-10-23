package com.learn.services.map;

import java.util.Set;

import com.learn.model.Owner;
import com.learn.model.Pet;
import com.learn.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet, Long>{

	public Set<Pet> findAll() {
		return super.findAll();
	}
	public Pet findById(Long id) {
		return super.findById(id);
		
	}
	public Pet save(Pet pet) {
		return super.save(pet.getId(), pet);
	}
	public void delete(Pet pet) {
		super.delete(pet);
	}
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
