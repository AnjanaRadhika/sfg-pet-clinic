package com.learn.services.map;

import java.util.Set;

import com.learn.model.Owner;
import com.learn.model.Vet;
import com.learn.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet, Long>{

	public Set<Vet> findAll() {
		return super.findAll();
	}
	public Vet findById(Long id) {
		return super.findById(id);
		
	}
	public Vet save(Vet vet) {
		return super.save(vet.getId(), vet);
	}
	public void delete(Vet vet) {
		super.delete(vet);
	}
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
