package com.learn.services.map;

import java.util.Set;

import com.learn.model.Owner;
import com.learn.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner, Long>{

	public Set<Owner> findAll() {
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return (Owner) super.findById(id);
	}

	@Override
	public Owner save(Owner owner) {
		// TODO Auto-generated method stub
		return super.save(owner.getId(), owner);
	}

	@Override
	public void delete(Owner owner) {
		// TODO Auto-generated method stub
		super.delete(owner);
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

}
