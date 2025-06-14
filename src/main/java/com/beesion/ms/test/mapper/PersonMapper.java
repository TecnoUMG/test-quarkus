package com.beesion.ms.test.mapper;

import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;

import jakarta.enterprise.context.ApplicationScoped;

public class PersonMapper {
    public PersonDto toDto(Person person) {
        PersonDto dto = new PersonDto();
        dto.setId(person.getId());
        dto.setName(person.getName());
        dto.setAge(person.getAge());
        return dto;
    }

    public Person toEntity(PersonDto dto) {
        Person person = new Person();
        person.setId(dto.getId());
        person.setName(dto.getName());
        person.setAge(dto.getAge());
        return person;
    }

}
