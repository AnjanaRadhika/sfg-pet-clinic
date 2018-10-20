package com.learn.services;

import com.learn.model.Owner;

public interface OwnerService extends CrudService <Owner,Long>{
	
	Owner findByLastName(String lastName);
	
}
