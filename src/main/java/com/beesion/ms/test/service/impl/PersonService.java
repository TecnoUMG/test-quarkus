package com.beesion.ms.test.service.impl;

import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;
import com.beesion.ms.test.mapper.PersonMapper;
import com.beesion.ms.test.repository.PersonRepo;
import com.beesion.ms.test.service.IPersonService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;


@ApplicationScoped
public class PersonService implements IPersonService {

	@Inject
	PersonRepo personRepo;

	@Inject
	PersonMapper mapper;

	@Override
	public void save(PersonDto dto) {
		Person person = mapper.toEntity(dto);
		personRepo.save(person);
	}

	@Override
	public List<PersonDto> findAll() {
		return personRepo.findAll().stream()
				.map(mapper::toDto)
				.collect(Collectors.toList());
	}

	@Override
	public void save(Person per) {

	}
}
