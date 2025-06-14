package com.beesion.ms.test.service;

import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;

import java.util.List;

public interface IPersonService {

	void save(PersonDto dto);

	List<PersonDto> findAll();

	public void save(Person per);

}
